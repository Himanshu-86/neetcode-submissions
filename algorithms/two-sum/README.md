# Two Sum

**Difficulty:** Easy

**Language:** Java

## Problem

https://leetcode.com/problems/two-sum/

## Solution

Automatically synchronized from LeetCode on September 22, 2026.

## Approach & Intuition

> Use a hash map to store each number's index as you iterate; for each element, check if its complement (target - nums[i]) has already been seen and return the stored index with the current index.

## Complexity

- **Time Complexity:** `O(N)` — The array is traversed once, and each hash map lookup/insertion is O(1) on average.
- **Space Complexity:** `O(N)` — In the worst case, the hash map stores up to N elements before a match is found.
