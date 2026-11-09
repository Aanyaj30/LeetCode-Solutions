<div align="center">

# 1606. Find Servers That Handled Most Number of Requests

![Difficulty](https://img.shields.io/badge/DIFFICULTY-Hard-ef4743?style=for-the-badge&labelColor=1a1a2e)  ![Language](https://img.shields.io/badge/LANGUAGE-Java-6c5ce7?style=for-the-badge&labelColor=1a1a2e)  ![Solutions](https://img.shields.io/badge/SOLUTIONS-1-6c5ce7?style=for-the-badge&labelColor=1a1a2e)  ![Date](https://img.shields.io/badge/DATE-2026--11--09-605d5d?style=for-the-badge&labelColor=1a1a2e)

[![View on LeetCode](https://img.shields.io/badge/View%20on-LeetCode-ffa116?style=flat-square&logo=leetcode&logoColor=ffa116)](https://leetcode.com/problems/find-servers-that-handled-most-number-of-requests/)

</div>

---

<div align="center">

<picture>
  <source media="(prefers-color-scheme: dark)" srcset="panel-dark.svg">
  <source media="(prefers-color-scheme: light)" srcset="panel-light.svg">
  <img alt="Topics: Array, Heap (Priority Queue), Simulation, Ordered Set — best runtime 125 ms (Beats 68%), best memory 100.8 MB (Beats 71%)" src="panel-dark.svg">
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
| 1 | [sol1.java](./sol1.java) | `Java` | 2026-11-09 ← **latest** |

---

### PROBLEM DESCRIPTION

You have `k` servers numbered from `0` to `k-1` that are being used to handle multiple requests simultaneously. Each server has infinite computational capacity but **cannot handle more than one request at a time**. The requests are assigned to servers according to a specific algorithm:

	- The `i^th` (0-indexed) request arrives.

	- If all servers are busy, the request is dropped (not handled at all).

	- If the `(i % k)^th` server is available, assign the request to that server.

	- Otherwise, assign the request to the next available server (wrapping around the list of servers and starting from 0 if necessary). For example, if the `i^th` server is busy, try to assign the request to the `(i+1)^th` server, then the `(i+2)^th` server, and so on.

You are given a **strictly increasing** array `arrival` of positive integers, where `arrival[i]` represents the arrival time of the `i^th` request, and another array `load`, where `load[i]` represents the load of the `i^th` request (the time it takes to complete). Your goal is to find the **busiest server(s)**. A server is considered **busiest** if it handled the most number of requests successfully among all the servers.

Return *a list containing the IDs (0-indexed) of the **busiest server(s)***. You may return the IDs in any order.

 

**Example 1:**

![](https://assets.leetcode.com/uploads/2020/09/08/load-1.png)
```

**Input:** k = 3, arrival = [1,2,3,4,5], load = [5,2,3,3,3] 
**Output:** [1] 
**Explanation:** 
All of the servers start out available.
The first 3 requests are handled by the first 3 servers in order.
Request 3 comes in. Server 0 is busy, so it's assigned to the next available server, which is 1.
Request 4 comes in. It cannot be handled since all servers are busy, so it is dropped.
Servers 0 and 2 handled one request each, while server 1 handled two requests. Hence server 1 is the busiest server.

```

**Example 2:**

```

**Input:** k = 3, arrival = [1,2,3,4], load = [1,2,1,2]
**Output:** [0]
**Explanation:** 
The first 3 requests are handled by first 3 servers.
Request 3 comes in. It is handled by server 0 since the server is available.
Server 0 handled two requests, while servers 1 and 2 handled one request each. Hence server 0 is the busiest server.

```

**Example 3:**

```

**Input:** k = 3, arrival = [1,2,3], load = [10,12,11]
**Output:** [0,1,2]
**Explanation:** Each server handles a single request, so they are all considered the busiest.

```

 

**Constraints:**

	- `1 <= k <= 10^5`

	- `1 <= arrival.length, load.length <= 10^5`

	- `arrival.length == load.length`

	- `1 <= arrival[i], load[i] <= 10^9`

	- `arrival` is **strictly increasing**.

---

<div align="center">

<sub>Auto-synced by <strong>LeetSync</strong> · Built by <a href="https://deveshsamant.in/">Devesh Samant</a></sub>

</div>
