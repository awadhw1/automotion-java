package net.itarray.automotion.tests.properties;

import net.itarray.automotion.internal.UIElement;
import net.itarray.automotion.internal.geometry.Direction;
import net.itarray.automotion.internal.geometry.Rectangle;
import net.itarray.automotion.internal.geometry.Scalar;
import net.itarray.automotion.internal.properties.ElementPropertyExpression;
import net.itarray.automotion.validation.properties.Expression;
import org.junit.Before;
import org.junit.Test;

import static net.itarray.automotion.internal.geometry.Scalar.scalar;
import static org.assertj.core.api.Assertions.assertThat;

public class ElementPropertyExpressionTest {

    private Expression<Scalar> property;

    @Before
    public void createProperty() {
        UIElement element = UIElement.asElement(new Rectangle(10, 20, 100, 200), "sample");
        this.property = element.extend(Direction.RIGHT);
    }

    @Test
    public void evaluatesToItsLambdaAppliedToTheRectangle() {
        Scalar result = property.evaluateIn(new TestContext(), Direction.RIGHT);
        assertThat(result).isEqualTo(scalar(90));
    }

    @Test
    public void describesItself() {
        String result = property.getDescription(new TestContext(), Direction.RIGHT);
        assertThat(result).isEqualTo("width of element 'sample'");
    }
}
