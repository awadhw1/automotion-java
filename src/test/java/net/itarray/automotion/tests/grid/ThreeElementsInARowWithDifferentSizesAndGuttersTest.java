package net.itarray.automotion.tests.grid;

import com.google.common.collect.Lists;
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

public class ThreeElementsInARowWithDifferentSizesAndGuttersTest extends GridTest {

    public List<WebElement> createElemements() {
        return newArrayList(
                    createElement(100, 50, 300, 60),
                    createElement(400, 50, 700, 60),
                    createElement(900, 50, 1200, 60));
    }

    @Test
    public void areNotAlignedInTwoColumns() {
        chunkValidator.alignedAsGrid(2);
        assertInvalid();
    }

    @Test
    public void areAlignedInThreeColumns() {
        chunkValidator.alignedAsGrid(3);
        assertValid();
    }

    @Test
    public void areAlignedInThreeColumnsAndOneRow() {
        chunkValidator.alignedAsGrid(3, 1);
        assertValid();
    }

    @Test
    public void areNotAlignedInThreeColumnsAndTwoRows() {
        chunkValidator.alignedAsGrid(3, 2);
        assertInvalid();
    }

    @Test
    public void areAlignedInFourColumns() {
        chunkValidator.alignedAsGrid(4);
        assertValid();
    }

    @Test
    public void areAlignedInFourColumnsAndOneRow() {
        chunkValidator.alignedAsGrid(4, 1);
        assertValid();
    }

    @Test
    public void areNotAlignedInFourColumnsAndTwoRows() {
        chunkValidator.alignedAsGrid(4, 2);
        assertInvalid();
    }
}
