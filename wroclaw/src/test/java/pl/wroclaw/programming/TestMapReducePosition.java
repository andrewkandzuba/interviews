package pl.wroclaw.programming;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
 * The suite contains tests to provide answers on "Programming Exercise 2 [MAP Reduce Problem]" section of the ç
 */
public class TestMapReducePosition {

    /**
     * Method returns pre generated test data
     * @return Stream of Position instances
     */
    private static Stream<Position> getTestStream(){
        List<Position> positions = new ArrayList<>();
        positions.add(new Position(1, 1, 10, 20, Position.AssetType.EQUITY));
        positions.add(new Position(1, 2, 15, 25, Position.AssetType.EQUITY));
        positions.add(new Position(1, 3, 25, 30, Position.AssetType.CORPORATE_BOND));
        positions.add(new Position(1, 4, 15, 20, Position.AssetType.GOVERNMENT_BOND));
        positions.add(new Position(1, 5, 20, 30, Position.AssetType.EQUITY));
        positions.add(new Position(1, 6, 25, 40, Position.AssetType.EQUITY));
        positions.add(new Position(1, 7, 35, 40, Position.AssetType.GOVERNMENT_BOND));
        positions.add(new Position(1, 8, 35, 40, Position.AssetType.EQUITY));
        return positions.stream();
    }

    /**
     * a) (( SUM( (LMV+SMV) /2) Where Asset Type = "EQUITY" ))/ NAV > 10%
     * @throws Exception
     */
    @Test
    public void testContainEquity10() throws Exception {
        Assert.assertTrue(PositionsAggregator.containEquity10(getTestStream()));
    }

    /**
     * b) ( SUM(LMV) where Asset Type In ("CORPORATE BOND","GOVERNMENT BOND") /NAV ) IS BETWEEN 15% AND 25%
     * @throws Exception
     */
    @Test
    public void testContainBond15to25() throws Exception {
        Assert.assertTrue(PositionsAggregator.containBond15to25(getTestStream()));
    }
}