package net.itarray.automotion.tests.grid;

import net.itarray.automotion.internal.ResponsiveUIValidatorBase;
import net.itarray.automotion.validation.ChunkUIElementValidator;
import net.itarray.automotion.validation.ResponsiveUIValidator;
import net.itarray.automotion.validation.UISnapshot;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import rectangles.DummyDriverFacade;

import java.util.List;

import static com.google.common.collect.Lists.newArrayList;
import static org.assertj.core.api.Assertions.assertThat;
import static rectangles.DummyWebElement.createElement;

public class SevenElementsInThreeRowsWithDifferentSizesAndGuttersTest extends GridTest {

    public List<WebElement> createElemements() {
        return newArrayList(
                    createElement(100, 50, 300, 60),
                    createElement(900, 50, 1200, 80),
                    createElement(1300, 50, 1800, 80),
                    createElement(100, 150, 300, 160),
                    createElement(400, 150, 700, 170),
                    createElement(1300, 150, 1800, 180)
                    );
    }

    @Test
    public void areNotAlignedInThreeColumnsAndTwoRows() {
        chunkValidator.alignedAsGrid(3, 2);
        assertInvalid();
    }
}
