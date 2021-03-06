package net.itarray.automotion.validation;

import net.itarray.automotion.internal.geometry.Scalar;
import net.itarray.automotion.validation.properties.Condition;
import org.openqa.selenium.WebElement;
import net.itarray.automotion.validation.properties.Padding;

import java.util.List;

import static net.itarray.automotion.validation.properties.Expression.percentOrPixels;
import static net.itarray.automotion.validation.properties.Condition.*;

public interface UIElementValidator {

    boolean validate();

    // position

    UIElementValidator isRightOf(WebElement element);
    UIElementValidator isRightOf(WebElement element, Condition<Scalar> distanceCondition);

    UIElementValidator isLeftOf(WebElement element);
    UIElementValidator isLeftOf(WebElement element, Condition<Scalar> distanceCondition);

    UIElementValidator isBelow(WebElement element);
    UIElementValidator isBelow(WebElement element, Condition<Scalar> distanceCondition);

    UIElementValidator isAbove(WebElement element);
    UIElementValidator isAbove(WebElement element, Condition<Scalar> distanceCondition);

    // area

    UIElementValidator isOverlapping(WebElement element, String readableName);
    UIElementValidator isNotOverlapping(WebElement element, String readableName);
    UIElementValidator isNotOverlapping(List<WebElement> elements);

    UIElementValidator isInsideOf(WebElement containerElement, String readableContainerName);
    UIElementValidator isInsideOf(WebElement containerElement, String readableContainerName, Padding padding);

    // alignment

    UIElementValidator isLeftAlignedWith(WebElement element, String readableName);
    UIElementValidator isLeftAlignedWith(List<WebElement> elements);

    UIElementValidator isRightAlignedWith(WebElement element, String readableName);
    UIElementValidator isRightAlignedWith(List<WebElement> elements);

    UIElementValidator isTopAlignedWith(WebElement element, String readableName);
    UIElementValidator isTopAlignedWith(List<WebElement> elements);

    UIElementValidator isBottomAlignedWith(WebElement element, String readableName);
    UIElementValidator isBottomAlignedWith(List<WebElement> elements);

    // size

    UIElementValidator hasWidth(Condition<Scalar> condition);
    UIElementValidator hasHeight(Condition<Scalar> condition);

    UIElementValidator hasEqualWidthAs(WebElement element, String readableName);
    UIElementValidator hasEqualWidthAs(List<WebElement> elements);

    UIElementValidator hasEqualHeightAs(WebElement element, String readableName);
    UIElementValidator hasEqualHeightAs(List<WebElement> elements);

    UIElementValidator hasEqualSizeAs(WebElement element, String readableName);
    UIElementValidator hasEqualSizeAs(List<WebElement> elements);

    UIElementValidator hasDifferentSizeAs(WebElement element, String readableName);
    UIElementValidator hasDifferentSizeAs(List<WebElement> elements);

    // offset?

    UIElementValidator hasLeftOffsetToPage(Condition<Scalar> condition);
    UIElementValidator hasRightOffsetToPage(Condition<Scalar> condition);
    UIElementValidator hasTopOffsetToPage(Condition<Scalar> condition);
    UIElementValidator hasBottomOffsetToPage(Condition<Scalar> condition);

    // css

    UIElementValidator hasCssValue(String cssProperty, String... args);
    UIElementValidator doesNotHaveCssValue(String cssProperty, String... args);

    // distribution?

    // NEEDS FRONTEND DEV FEEDBACK
    UIElementValidator isCenteredOnPageHorizontally();
    UIElementValidator isCenteredOnPageVertically();

    /**
     * @deprecated As of release 2.0, replaced by {@link net.itarray.automotion.validation.ResponsiveUIValidator#drawMap()}
     */
    @Deprecated
    UIElementValidator drawMap();
    /**
     * @deprecated As of release 2.0, replaced by {@link net.itarray.automotion.validation.ResponsiveUIValidator#dontDrawMap()}
     */
    @Deprecated
    UIElementValidator dontDrawMap();

    /**
     * @deprecated As of release 2.0, replaced by {@link net.itarray.automotion.validation.properties.Expression#percent(int, net.itarray.automotion.internal.properties.PercentReference)}
     */
    @Deprecated
    UIElementValidator changeMetricsUnitsTo(util.validator.ResponsiveUIValidator.Units units);

    /**
     * @deprecated As of release 2.0, replaced by {@link net.itarray.automotion.validation.properties.Expression#percent(int, net.itarray.automotion.internal.properties.PercentReference)}
     */
    @Deprecated
    UIElementValidator changeMetricsUnitsTo(Units units);

    /**
     * @deprecated As of release 2.0, replaced by {@link UIElementValidator#isRightOf(org.openqa.selenium.WebElement)}
     */
    @Deprecated
    default UIElementValidator withLeftElement(WebElement element) { return isRightOf(element); }
    /**
     * @deprecated As of release 2.0, replaced by {@link UIElementValidator#isRightOf(org.openqa.selenium.WebElement, net.itarray.automotion.validation.properties.Condition)}
     */
    @Deprecated
    default UIElementValidator withLeftElement(WebElement element, int minMargin, int maxMargin) {return isRightOf(element, between(percentOrPixels(minMargin)).and(percentOrPixels(maxMargin))); }

    /**
     * @deprecated As of release 2.0, replaced by {@link UIElementValidator#isLeftOf(org.openqa.selenium.WebElement)}
     */
    @Deprecated
    default UIElementValidator withRightElement(WebElement element) { return isLeftOf(element); }

    /**
     * @deprecated As of release 2.0, replaced by {@link UIElementValidator#isLeftOf(org.openqa.selenium.WebElement, net.itarray.automotion.validation.properties.Condition)}
     */
    @Deprecated
    default UIElementValidator withRightElement(WebElement element, int minMargin, int maxMargin) { return isLeftOf(element, between(percentOrPixels(minMargin)).and(percentOrPixels(maxMargin))); }

    /**
     * @deprecated As of release 2.0, replaced by {@link UIElementValidator#isBelow(org.openqa.selenium.WebElement)}
     */
    @Deprecated
    default UIElementValidator withTopElement(WebElement element) { return isBelow(element); }
    /**
     * @deprecated As of release 2.0, replaced by {@link UIElementValidator#isBelow(org.openqa.selenium.WebElement, net.itarray.automotion.validation.properties.Condition)}
     */
    @Deprecated
    default UIElementValidator withTopElement(WebElement element, int minMargin, int maxMargin) { return isBelow(element, between(percentOrPixels(minMargin)).and(percentOrPixels(maxMargin))); }

    /**
     * @deprecated As of release 2.0, replaced by {@link UIElementValidator#isAbove(org.openqa.selenium.WebElement)}
     */
    @Deprecated
    default UIElementValidator withBottomElement(WebElement element) { return isAbove(element); }
    /**
     * @deprecated As of release 2.0, replaced by {@link UIElementValidator#isAbove(org.openqa.selenium.WebElement, net.itarray.automotion.validation.properties.Condition)}
     */
    @Deprecated
    default UIElementValidator withBottomElement(WebElement element, int minMargin, int maxMargin){ return isAbove(element, between(percentOrPixels(minMargin)).and(percentOrPixels(maxMargin))); }

    /**
     * @deprecated As of release 2.0, replaced by {@link UIElementValidator#isNotOverlapping(org.openqa.selenium.WebElement, String)}
     */
    @Deprecated
    default UIElementValidator notOverlapWith(WebElement element, String readableName) { return isNotOverlapping(element, readableName); }
    /**
     * @deprecated As of release 2.0, replaced by {@link UIElementValidator#isNotOverlapping(java.util.List)}
     */
    @Deprecated
    default UIElementValidator notOverlapWith(List<WebElement> elements) { return isNotOverlapping(elements); }

    /**
     * @deprecated As of release 2.0, replaced by {@link UIElementValidator#isOverlapping(org.openqa.selenium.WebElement, String)}
     */
    @Deprecated
    default UIElementValidator overlapWith(WebElement element, String readableName) { return isOverlapping(element, readableName); }

    /**
     * @deprecated As of release 2.0, replaced by {@link UIElementValidator#isLeftAlignedWith(org.openqa.selenium.WebElement, String)}
     */
    @Deprecated
    default UIElementValidator sameOffsetLeftAs(WebElement element, String readableName) { return isLeftAlignedWith(element, readableName); }
    /**
     * @deprecated As of release 2.0, replaced by {@link UIElementValidator#isLeftAlignedWith(java.util.List)}
     */
    @Deprecated
    default UIElementValidator sameOffsetLeftAs(List<WebElement> elements) { return isLeftAlignedWith(elements); }

    /**
     * @deprecated As of release 2.0, replaced by {@link UIElementValidator#isRightAlignedWith(org.openqa.selenium.WebElement, String)}
     */
    @Deprecated
    default UIElementValidator sameOffsetRightAs(WebElement element, String readableName) { return isRightAlignedWith(element, readableName); }
    /**
     * @deprecated As of release 2.0, replaced by {@link UIElementValidator#isRightAlignedWith(java.util.List)}
     */
    @Deprecated
    default UIElementValidator sameOffsetRightAs(List<WebElement> elements) { return isRightAlignedWith(elements); }

    /**
     * @deprecated As of release 2.0, replaced by {@link UIElementValidator#isTopAlignedWith(org.openqa.selenium.WebElement, String)}
     */
    @Deprecated
    default UIElementValidator sameOffsetTopAs(WebElement element, String readableName) { return isTopAlignedWith(element, readableName); }
    /**
     * @deprecated As of release 2.0, replaced by {@link UIElementValidator#isTopAlignedWith(java.util.List)}
     */
    @Deprecated
    default UIElementValidator sameOffsetTopAs(List<WebElement> elements) { return isTopAlignedWith(elements); }

    /**
     * @deprecated As of release 2.0, replaced by {@link UIElementValidator#isBottomAlignedWith(org.openqa.selenium.WebElement, String)}
     */
    @Deprecated
    default UIElementValidator sameOffsetBottomAs(WebElement element, String readableName) { return isBottomAlignedWith(element, readableName); }
    /**
     * @deprecated As of release 2.0, replaced by {@link UIElementValidator#isBottomAlignedWith(java.util.List)}
     */
    @Deprecated
    default UIElementValidator sameOffsetBottomAs(List<WebElement> elements) { return isBottomAlignedWith(elements); }


    /**
     * @deprecated As of release 2.0, replaced by {@link UIElementValidator#hasEqualWidthAs(org.openqa.selenium.WebElement, String)}
     */
    @Deprecated
    default UIElementValidator sameWidthAs(WebElement element, String readableName) { return hasEqualWidthAs(element, readableName); }

    /**
     * @deprecated As of release 2.0, replaced by {@link UIElementValidator#hasEqualWidthAs(java.util.List)}
     */
    @Deprecated
    default UIElementValidator sameWidthAs(List<WebElement> elements) { return hasEqualWidthAs(elements); }
    /**
     * @deprecated As of release 2.0, replaced by {@link UIElementValidator#hasEqualHeightAs(org.openqa.selenium.WebElement, String)}
     */
    @Deprecated
    default UIElementValidator sameHeightAs(WebElement element, String readableName) { return hasEqualHeightAs(element, readableName); }

    /**
     * @deprecated As of release 2.0, replaced by {@link UIElementValidator#hasEqualHeightAs(java.util.List)}
     */
    @Deprecated
    default UIElementValidator sameHeightAs(List<WebElement> elements) { return hasEqualHeightAs(elements); }
    /**
     * @deprecated As of release 2.0, replaced by {@link UIElementValidator#hasEqualSizeAs(org.openqa.selenium.WebElement, String)}
     */
    @Deprecated
    default UIElementValidator sameSizeAs(WebElement element, String readableName) { return hasEqualSizeAs(element, readableName); }

    /**
     * @deprecated As of release 2.0, replaced by {@link UIElementValidator#hasEqualSizeAs(java.util.List)}
     */
    @Deprecated
    default UIElementValidator sameSizeAs(List<WebElement> elements) { return hasEqualSizeAs(elements); }
    /**
     * @deprecated As of release 2.0, replaced by {@link UIElementValidator#hasDifferentSizeAs(org.openqa.selenium.WebElement, String)}
     */
    @Deprecated
    default UIElementValidator notSameSizeAs(WebElement element, String readableName) { return hasDifferentSizeAs(element, readableName); }

    /**
     * @deprecated As of release 2.0, replaced by {@link UIElementValidator#hasDifferentSizeAs(java.util.List)}
     */
    @Deprecated
    default UIElementValidator notSameSizeAs(List<WebElement> elements) { return hasDifferentSizeAs(elements); }


    /**
     * @deprecated As of release 2.0, replaced by {@link UIElementValidator#hasWidth(net.itarray.automotion.validation.properties.Condition)}
     */
    @Deprecated
    default UIElementValidator minWidth(int width) { return hasWidth(greaterOrEqualTo(percentOrPixels(width))); }

    /**
     * @deprecated As of release 2.0, replaced by {@link UIElementValidator#hasWidth(net.itarray.automotion.validation.properties.Condition)}
     */
    @Deprecated
    default UIElementValidator maxWidth(int width) { return hasWidth(lessOrEqualTo(percentOrPixels(width))); }

    /**
     * @deprecated As of release 2.0, replaced by {@link UIElementValidator#hasWidth(net.itarray.automotion.validation.properties.Condition)}
     */
    @Deprecated
    default UIElementValidator widthBetween(int min, int max) { return hasWidth(between(percentOrPixels(min)).and(percentOrPixels(max))); }

    /**
     * @deprecated As of release 2.0, replaced by {@link UIElementValidator#hasHeight(net.itarray.automotion.validation.properties.Condition)}
     */
    @Deprecated
    default UIElementValidator minHeight(int height) { return hasHeight(greaterOrEqualTo(percentOrPixels(height))); }

    /**
     * @deprecated As of release 2.0, replaced by {@link UIElementValidator#hasHeight(net.itarray.automotion.validation.properties.Condition)}
     */
    @Deprecated
    default UIElementValidator maxHeight(int height) { return hasHeight(lessOrEqualTo(percentOrPixels(height))); }

    /**
     * @deprecated As of release 2.0, replaced by {@link UIElementValidator#hasHeight(net.itarray.automotion.validation.properties.Condition)}
     */
    @Deprecated
    default UIElementValidator heightBetween(int min, int max) { return hasHeight(between(percentOrPixels(min)).and(percentOrPixels(max))); }

    /**
     * @deprecated As of release 2.0, replaced by {@link UIElementValidator#hasLeftOffsetToPage(net.itarray.automotion.validation.properties.Condition)}
     *                                            {@link UIElementValidator#hasRightOffsetToPage(net.itarray.automotion.validation.properties.Condition)}
     *                                            {@link UIElementValidator#hasTopOffsetToPage(net.itarray.automotion.validation.properties.Condition)}
     *                                            {@link UIElementValidator#hasBottomOffsetToPage(net.itarray.automotion.validation.properties.Condition)}
     */
    @Deprecated
    UIElementValidator minOffset(int top, int right, int bottom, int left);
    /**
     * @deprecated As of release 2.0, replaced by {@link UIElementValidator#hasLeftOffsetToPage(net.itarray.automotion.validation.properties.Condition)}
     *                                            {@link UIElementValidator#hasRightOffsetToPage(net.itarray.automotion.validation.properties.Condition)}
     *                                            {@link UIElementValidator#hasTopOffsetToPage(net.itarray.automotion.validation.properties.Condition)}
     *                                            {@link UIElementValidator#hasBottomOffsetToPage(net.itarray.automotion.validation.properties.Condition)}
     */
    @Deprecated
    UIElementValidator maxOffset(int top, int right, int bottom, int left);

    /**
     * @deprecated As of release 2.0, replaced by {@link UIElementValidator#hasCssValue(String, String...)}
     */
    @Deprecated
    default UIElementValidator withCssValue(String cssProperty, String... args) { return hasCssValue(cssProperty, args); }

    /**
     * @deprecated As of release 2.0, replaced by {@link UIElementValidator#doesNotHaveCssValue(String, String...)}
     */
    @Deprecated
    default UIElementValidator withoutCssValue(String cssProperty, String... args) { return doesNotHaveCssValue(cssProperty, args); }

    /**
     * @deprecated As of release 2.0, replaced by {@link UIElementValidator#isCenteredOnPageHorizontally()}
     */
    @Deprecated
    default UIElementValidator equalLeftRightOffset() { return isCenteredOnPageHorizontally(); }

    /**
     * @deprecated As of release 2.0, replaced by {@link UIElementValidator#isCenteredOnPageVertically()}
     */
    @Deprecated
    default UIElementValidator equalTopBottomOffset() { return isCenteredOnPageVertically(); }

    /**
     * @deprecated As of release 2.0, replaced by {@link UIElementValidator#isInsideOf(org.openqa.selenium.WebElement, String)}
     */
    @Deprecated
    default UIElementValidator insideOf(WebElement containerElement, String readableContainerName) { return isInsideOf(containerElement, readableContainerName); }

    /**
     * @deprecated As of release 2.0, replaced by {@link UIElementValidator#isInsideOf(org.openqa.selenium.WebElement, String, net.itarray.automotion.validation.properties.Padding)}
     */
    default UIElementValidator insideOf(WebElement containerElement, String readableContainerName, Padding padding) { return isInsideOf(containerElement, readableContainerName, padding); }

}
