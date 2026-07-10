# User Operations Manual

## System Constraints & Boundaries

The data insertion manager checks inputs against specific business validation rules:

- **Age Limits**: Must fall strictly within the integer range of `5` to `100`.
- **Grade**: Evaluates decimal scores between `0.0` and `100.0`.

## Feature Directory

### 1. Add New Student (Choice 1)

Prompts you to input the fields consecutively. If the inputs don't meet validation limits, the program automatically rejects the record entry.

### 2. View All Records (Choice 2)

Displays every currently stored tracking profile into a structured tabular text grid output.

### 3. Search Engine (Choice 3)

Allows you to locate individual profiles directly by querying a specific `Student ID`.

### 4. Record Modifications (Choice 4 & 5)

Allows updating or permanently deleting entries based on a matching target `Student ID`.

## Compile Guide

1. Compile all the application source modules simultaneously:
    // "javac *.java"
2. Run
    // "java StudentInformationSystem"
