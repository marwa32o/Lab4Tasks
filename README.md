# Lab 4: Collections, Performance, and Immutability

## Description
This repository contains solutions for Java Lab 4, covering collection benchmarking, safe collection iteration, map modifications, unmodifiable wrappers, and immutable class design.

## Structure
- `StringPerformance`: Measures `String` vs `StringBuilder` runtime.
- `CourseManager`: Demonstrates safe `Iterator.remove()` usages.
- `TreasureMap`: Performs update operations on Java `Map` keys.
- `Zoo`: Demonstrates `Collections.unmodifiableList()`.
- `StudentDirectory`: Encapsulates a read-only student ID key set.
- `Point`: Implements a fully immutable 2D coordinate class using `final`.

## Reflection
Designing `Point` as an immutable class prevents side-effects in multi-threaded contexts and ensures object state remains reliable throughout runtime.
