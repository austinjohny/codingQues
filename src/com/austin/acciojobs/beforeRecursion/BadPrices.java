/*
Polycarp analyzes the prices of the new berPhone. At his disposal are the prices for n last days: a₁,a₂,…,aₙ,
where ai is the price of berPhone on the day i.

Polycarp considers the price on the day i to be bad if later (that is, a day with a greater number)
berPhone was sold at a lower price. For example, if n=6 and a=[3,9,4,6,7,5], then the number of days
with a bad price is 3 — these are days 2 (a₂ = 9), 4 (a₄ = 6), and 5 (a₅=7).

Print the number of days with a bad price.

Input Format
The first line contains an integer n — the number of days.
The second line contains n integers a₁,a₂,…,aₙ, where aᵢ is the price on the i-th day.

Output Format
Print the number of days with a bad price.

    Example 1
    Input
    6
    3 9 4 6 7 5

    Output
    3

    Explanation
    Day 2, 4, and 5 have bad price.

    Example 2
    Input
    2
    2 1

    Output
    1

    Explanation
    Day 1 has a bad price.

Constraints
1 <= n <= 150000
1 <= aᵢ <= 10^6
 */

package com.austin.acciojobs.beforeRecursion;

public class BadPrices {
}
