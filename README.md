# LeetCode Solutions - Maven Project

This repository contains my LeetCode problem solutions organized by algorithm patterns and data structures, now structured as a Maven project.

## 📁 Project Structure

```
LeetCode/
├── pom.xml                           # Maven configuration
├── README.md                         # This file
├── src/
│   └── main/
│       └── java/
│           └── com/
│               └── leetcode/
│                   ├── utils/        # Shared utility classes
│                   │   ├── TreeNode.java
│                   │   └── ListNode.java
│                   ├── array/        # Array problems
│                   │   ├── twopointers/
│                   │   ├── binarysearch/
│                   │   └── heap/
│                   ├── string/       # String problems
│                   │   ├── stack/
│                   │   ├── hashtable/
│                   │   ├── backtracking/
│                   │   └── simulation/
│                   ├── tree/         # Tree problems
│                   │   ├── dfs/
│                   │   ├── bfs/
│                   │   ├── binarysearchtree/
│                   │   └── binarytree/
│                   └── linkedlist/   # Linked list problems
│                       ├── twopointers/
│                       └── manipulation/
```

## 🔧 Maven Setup

### Prerequisites
- Java 11 or higher
- Maven 3.6 or higher

### Build and Run

```bash
# Compile the project
mvn compile

# Run tests (if any)
mvn test

# Package the project
mvn package

# Clean build artifacts
mvn clean

# Run a specific class
mvn exec:java -Dexec.mainClass="com.leetcode.array.twopointers.RemoveDuplicates"
```

### Running Individual Solutions

```bash
# Compile and run any solution
mvn compile exec:java -Dexec.mainClass="com.leetcode.package.ClassName"

# Example:
mvn compile exec:java -Dexec.mainClass="com.leetcode.array.twopointers.RemoveDuplicates"
```

## 📦 Package Organization

All classes are organized under the `com.leetcode` package with sub-packages:
- `com.leetcode.utils` - Shared utility classes
- `com.leetcode.array.*` - Array-related problems
- `com.leetcode.string.*` - String-related problems  
- `com.leetcode.tree.*` - Tree-related problems
- `com.leetcode.linkedlist.*` - Linked list problems

## 🚀 Quick Start

1. Clone or download this repository
2. Navigate to the project directory
3. Run `mvn compile` to build the project
4. Use `mvn exec:java` to run specific solutions

---
Last updated: 12.10.2025
