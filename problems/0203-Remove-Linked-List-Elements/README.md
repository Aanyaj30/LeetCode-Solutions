<div align="center">

# 203. Remove Linked List Elements

![Difficulty](https://img.shields.io/badge/DIFFICULTY-Easy-00b8a3?style=for-the-badge&labelColor=1a1a2e)  ![Language](https://img.shields.io/badge/LANGUAGE-Java-6c5ce7?style=for-the-badge&labelColor=1a1a2e)  ![Solutions](https://img.shields.io/badge/SOLUTIONS-1-6c5ce7?style=for-the-badge&labelColor=1a1a2e)  ![Date](https://img.shields.io/badge/DATE-2026--11--01-605d5d?style=for-the-badge&labelColor=1a1a2e)

[![View on LeetCode](https://img.shields.io/badge/View%20on-LeetCode-ffa116?style=flat-square&logo=leetcode&logoColor=ffa116)](https://leetcode.com/problems/remove-linked-list-elements/)

</div>

---

<div align="center">

<picture>
  <source media="(prefers-color-scheme: dark)" srcset="panel-dark.svg">
  <source media="(prefers-color-scheme: light)" srcset="panel-light.svg">
  <img alt="Topics: Linked List, Recursion — best runtime 1 ms (Beats 97%), best memory 46.9 MB (Beats 87%)" src="panel-dark.svg">
</picture>

</div>

> **New personal best** — Runtime improved on this submission.

### HOW IT WENT

| | |
|:--|:--|
| **Attempts** | first try |
| **Time to solve** | 20 min |
| **Verdicts** | ✅ Accepted |

---

### NOTES

_No notes yet._

---

### SOLUTIONS (1)

| # | File | Language | Date |
|:-:|------|:--------:|:----:|
| 1 | [sol1.java](./sol1.java) | `Java` | 2026-11-01 ← **latest** |

---

### PROBLEM DESCRIPTION

Given the `head` of a linked list and an integer `val`, remove all the nodes of the linked list that has `Node.val == val`, and return *the new head*.

 

**Example 1:**

![](https://assets.leetcode.com/uploads/2021/03/06/removelinked-list.jpg)
```

**Input:** head = [1,2,6,3,4,5,6], val = 6
**Output:** [1,2,3,4,5]

```

**Example 2:**

```

**Input:** head = [], val = 1
**Output:** []

```

**Example 3:**

```

**Input:** head = [7,7,7,7], val = 7
**Output:** []

```

 

**Constraints:**

	- The number of nodes in the list is in the range `[0, 10^4]`.

	- `1 <= Node.val <= 50`

	- `0 <= val <= 50`

---

<div align="center">

<sub>Auto-synced by <strong>LeetSync</strong> · Built by <a href="https://deveshsamant.in/">Devesh Samant</a></sub>

</div>
