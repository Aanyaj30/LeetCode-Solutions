<div align="center">

# 3789. Minimum Cost to Acquire Required Items

![Difficulty](https://img.shields.io/badge/DIFFICULTY-Medium-ffa116?style=for-the-badge&labelColor=1a1a2e)  ![Language](https://img.shields.io/badge/LANGUAGE-Java-6c5ce7?style=for-the-badge&labelColor=1a1a2e)  ![Solutions](https://img.shields.io/badge/SOLUTIONS-1-6c5ce7?style=for-the-badge&labelColor=1a1a2e)  ![Date](https://img.shields.io/badge/DATE-2026--11--11-605d5d?style=for-the-badge&labelColor=1a1a2e)

[![View on LeetCode](https://img.shields.io/badge/View%20on-LeetCode-ffa116?style=flat-square&logo=leetcode&logoColor=ffa116)](https://leetcode.com/problems/minimum-cost-to-acquire-required-items/)

</div>

---

<div align="center">

<picture>
  <source media="(prefers-color-scheme: dark)" srcset="panel-dark.svg">
  <source media="(prefers-color-scheme: light)" srcset="panel-light.svg">
  <img alt="Topics: Math, Greedy — best runtime 2 ms (Beats 41%), best memory 42.2 MB (Beats 85%)" src="panel-dark.svg">
</picture>

</div>

> **New personal best** — Runtime improved on this submission.

### HOW IT WENT

| | |
|:--|:--|
| **Attempts** | first try |
| **Time to solve** | 1 min |
| **Verdicts** | ✅ Accepted |

---

### NOTES

_No notes yet._

---

### SOLUTIONS (1)

| # | File | Language | Date |
|:-:|------|:--------:|:----:|
| 1 | [sol1.java](./sol1.java) | `Java` | 2026-11-11 ← **latest** |

---

### PROBLEM DESCRIPTION

You are given five integers `cost1`, `cost2`, `costBoth`, `need1`, and `need2`.

There are three types of items available:

	- An item of **type 1** costs `cost1` and contributes 1 unit to the type 1 requirement only.

	- An item of **type 2** costs `cost2` and contributes 1 unit to the type 2 requirement only.

	- An item of **type 3** costs `costBoth` and contributes 1 unit to **both** type 1 and type 2 requirements.

You must collect enough items so that the total contribution toward type 1 is **at least** `need1` and the total contribution toward type 2 is **at least** `need2`.

Return an integer representing the **minimum** possible total cost to achieve these requirements.

 

**Example 1:**

**Input:** cost1 = 3, cost2 = 2, costBoth = 1, need1 = 3, need2 = 2

**Output:** 3

**Explanation:**

After buying three type 3 items, which cost `3 * 1 = 3`, the total contribution to type 1 is 3 (`>= need1 = 3`) and to type 2 is 3 (`>= need2 = 2`).
Any other valid combination would cost more, so the minimum total cost is 3.

**Example 2:**

**Input:** cost1 = 5, cost2 = 4, costBoth = 15, need1 = 2, need2 = 3

**Output:** 22

**Explanation:**

We buy `need1 = 2` items of type 1 and `need2 = 3` items of type 2: `2 * 5 + 3 * 4 = 10 + 12 = 22`.

Any other valid combination would cost more, so the minimum total cost is 22.

**Example 3:**

**Input:** cost1 = 5, cost2 = 4, costBoth = 15, need1 = 0, need2 = 0

**Output:** 0

**Explanation:**

Since no items are required (`need1 = need2 = 0`), we buy nothing and pay 0.

 

**Constraints:**

	- `1 <= cost1, cost2, costBoth <= 10^6`

	- `0 <= need1, need2 <= 10^9`

---

<div align="center">

<sub>Auto-synced by <strong>LeetSync</strong> · Built by <a href="https://deveshsamant.in/">Devesh Samant</a></sub>

</div>
