# Find the Town Judge

**Difficulty:** Easy

**Language:** Java

## Problem

https://leetcode.com/problems/find-the-town-judge/

## Solution

Automatically synchronized from LeetCode on September 23, 2026.

## Approach & Intuition

> Use an array to track the net trust score for each person: decrement for each outgoing trust and increment for each incoming trust. The town judge is the person with a score of n-1 (trusted by everyone else and trusts no one).

## Complexity

- **Time Complexity:** `O(N + E)` — We iterate through the trust list of size E to update scores, then scan N people to find the judge.
- **Space Complexity:** `O(N)` — We allocate an array of size N+1 to store trust scores.
