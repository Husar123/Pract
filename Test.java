/**
 * Created by Monia on 16.03.2017.
 */

import org.junit.Assert;
import org.junit.Test;

class FractionTest {

           @Test
        public void test_SanityTest_JUnitWorks() {
               Assert.assertEquals ((2), 1 + 1);
        }
        @Test
        public void test_CreateFractionWith1Parametr_FractionParamOne() {
            Assert.assertEquals((2 + "/" + 1), new Fraction(2).toString());
        }
        @Test
        public void test_CreateFractionWith2Parametr_Fraction() {
            Assert.assertEquals((1 + "/" + 2), new Fraction(1, 2).toString());
        }
        @Test
        public void test_CreateFractionWithNoParametr_FractionZeroOne ()
        {
            Assert.assertEquals((0 + "/" + 1), new Fraction().toString());
        }


        @Test
        public void test_CreateFractionWithNegativeDenominator_MinusAppliesToNumerator () {
            Fraction f1 = new Fraction(2, -1);
            Assert.assertEquals(-2, f1.getNumerator());
            Assert.assertEquals(1, f1.getDenominator());

            Fraction f2 = new Fraction(1, -2);
            Assert.assertEquals(-1, f2.getNumerator());
            Assert.assertEquals(2, f2.getDenominator());
        }
        @Test
        public void test_CreateFractionWithNegativeDenominatorAndNumerator_FractionWithPositiveFraction () {
            Fraction f1 = new Fraction(-1, -2);
            Assert.assertEquals(2, f1.getNumerator());
            Assert.assertEquals(1, f1.getDenominator());

            Fraction f2 = new Fraction(-1, -2);
            Assert.assertEquals(1, f2.getNumerator());
            Assert.assertEquals(2, f2.getDenominator());
        }

        @Test
        public void test_isProper_Property() {
            Fraction f1 = new Fraction(2, 1);
            Assert.assertEquals(false, f1.isProper());


            Fraction f2 = new Fraction(1, 2);
            Assert.assertEquals(true, f2.isProper());

        }

        @Test
        public void test_toString_String() {
            Fraction f1 = new Fraction(2, 1);
            Assert.assertEquals(("12/8"), f1.toString());


            Fraction f2 = new Fraction(1, 2);
            Assert.assertEquals(("5/8"), f2.toString());

        }

        @Test
        public void test_Simplify_SimplFraction() {
            Fraction f1 = new Fraction(2, 1);
            Assert.assertEquals((1 + "/" + 2), f1.simplify().toString());
            Fraction f2 = new Fraction(1, 2);
            Assert.assertEquals((1 + "/" + 2), f2.simplify().toString());
        }
        @Test
        public void test_FractionAdd_SimplFraction() {
            Fraction f1 = new Fraction(2, 1);
            Fraction f2 = new Fraction(1, 2);
            Assert.assertEquals(2 + "/" + 1, Fraction.add(f1, f2).toString());
            Fraction f3 = new Fraction(2, 1);
            Fraction f4 = new Fraction(-1, 2);
            Assert.assertEquals(1 + "/" + 2, Fraction.add(f3, f4).toString());
        }
        @Test
        public void test_FractionSubtract_SimplFraction() {
            Fraction f1 = new Fraction(2, 1);
            Fraction f2 = new Fraction(1, 2);
            Assert.assertEquals(1 + "/" + 2, Fraction.subtract(f1, f2).toString());
            Fraction f3 = new Fraction(2, 1);
            Fraction f4 = new Fraction(-1, 2);
            Assert.assertEquals(1 + "/" + 2, Fraction.add(f3, f4).toString());
        }
        @Test
        public void test_FractionMultiply_SimplFraction() {
            Fraction f1 = new Fraction(2, 1);
            Fraction f2 = new Fraction(1, 2);
            Assert.assertEquals(1 + "/" + 2, Fraction.multiply(f1, f2).toString());
            Fraction f3 = new Fraction(2, 1);
            Fraction f4 = new Fraction(-1, 2);
            Assert.assertEquals(-1 + "/" + 2, Fraction.multiply(f3, f4).toString());
        }
        @Test
        public void test_FractionDivide_SimplFraction() {
            Fraction f1 = new Fraction(2, 1);
            Fraction f2 = new Fraction(1, 2);
            Assert.assertEquals(2 + "/" + 1, Fraction.divide(f1, f2).toString());
            Fraction f3 = new Fraction(2, 1);
            Fraction f4 = new Fraction(-1, 2);
            Assert.assertEquals((-2 + "/" + 1), Fraction.divide(f3, f4).toString());
        }
    }