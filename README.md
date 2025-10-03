# LeetCode Solutions

This repository contains my LeetCode problem solutions organized by algorithm patterns and data structures.

## 📁 Folder Structure

```
LeetCode/
├── README.md
├── utils/
│   ├── TreeNode.java      # Shared TreeNode class
│   └── ListNode.java      # Shared ListNode class
├── array/
│   ├── two-pointers/      # 3 problems
│   ├── binary-search/     # 1 problem
│   └── heap/              # 1 problem
├── string/
│   ├── stack/             # 2 problems
│   ├── hash-table/        # 1 problem
│   ├── backtracking/      # 1 problem
│   └── simulation/        # 1 problem
├── tree/
│   ├── dfs/               # 5 problems
│   ├── bfs/               # 1 problem
│   └── binary-search-tree/ # 4 problems
└── linked-list/
    ├── two-pointers/      # 2 problems
    └── manipulation/      # 1 problem
```

## 🚀 Progress Tracking

- **Total Problems Solved:** 15
- **Array Problems:** 5
- **String Problems:** 5
- **Tree Problems:** 5
- **Linked List Problems:** 3

## 🛠️ Algorithm Patterns Covered

### Array
- **Two Pointers:** RemoveDuplicates, ThreeSumClosest, TrappingRainWater
- **Binary Search:** SortInRotatedArray
- **Heap (Priority Queue):** ConstructMultipleArray

### String
- **Stack:** ValidParentheses, LongestValidParentheses
- **Hash Table:** IsIsomorphic
- **Backtracking:** LetterCombinations
- **Simulation:** ZigZagConversion

### Tree
- **DFS:** MinDepth, ValidateBST, SortedArrayToBST, PathSum, SortedLinkedListToBST
- **BFS:** MinDepth (BFS version)
- **Binary Search Tree:** ValidateBST, SortedArrayToBST, KthSmallestElement, SortedLinkedListToBST

### Linked List
- **Two Pointers:** RemoveDuplicatesFromSortedList, RotateRight
- **Manipulation:** SwapPairs

## 📝 Notes

- All solutions include both iterative and recursive approaches where applicable
- Code follows Java best practices with proper package organization
- Each solution includes time and space complexity analysis
- Solutions are tested against LeetCode test cases
- Package structure follows algorithm pattern organization

## 🔧 Setup

```bash
# Compile and run any solution
javac -cp . ProblemName.java
java -cp . package.name.ProblemName
```

## 🌿 Git Branching Strategy

This repository uses pattern-based branching for development:

```bash
# Work on specific algorithm patterns
git checkout -b feature/array-two-pointers
git checkout -b feature/string-stack
git checkout -b feature/tree-dfs
git checkout -b feature/binary-search
```

---
*Last updated: $(date)*
