package DesignPatterns.Startergy;

/**
 * PathCalculator — Strategy interface for the Strategy pattern.
 *
 * Defines the contract for calculating a path between two locations.
 * Each concrete implementation represents a different mode of
 * transportation (car, bike, walk, etc.) with its own pathfinding
 * algorithm and ETA calculation.
 *
 * This is the "Strategy" in the Strategy Design Pattern — the
 * common interface that all algorithms must implement.
 */
public interface PathCalculator {
    public String findPath(String source , String destination);

}
