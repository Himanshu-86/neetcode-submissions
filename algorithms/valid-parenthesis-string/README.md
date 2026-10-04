# Valid Parenthesis String

**Difficulty:** 🟡 **Medium**  
**LeetCode Link:** [Valid Parenthesis String](https://leetcode.com/problems/valid-parenthesis-string/)

---

## Solutions

### ☕ Java (`solution.java`)

- **Synchronized:** October 4, 2026
- **Language:** `Java`
- **Source File:** [`solution.java`](solution.java)

#### 💡 Approach & Intuition

> Track the possible range of unmatched open parentheses using minOpen and maxOpen, where '*' can act as '(', ')', or empty; clamp minOpen to 0 and fail if maxOpen becomes negative.

#### ⏱️ Complexity Analysis

- **Time Complexity:** `O(N)` — *The algorithm performs a single pass over the string of length N, doing constant work per character.*
- **Space Complexity:** `O(N)` — *The call to s.toCharArray() creates an auxiliary character array of size N, while the remaining variables use O(1) extra space.*
