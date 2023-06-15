# sort-o_CrabbyChips

* Crabby Chips: Lauren Lee and Diana Akhmedova
* APCS pd8
* Lab 04
* 2022-01-10
* Time Spent: 2.5 hrs
* SOTW: Are You Bored Yet? by Wallows

## Best and Worst Case Scenario for Each
### Bubble Sort:
* Best: [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]; [0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
  * Description: An ArrayList of elements in ascending order or of the same elements.
  * Reason: This is the best case(s) because it required no swaps.
  * Total Comparisons: 45
  * Total Swaps: 0
  * Big-O Classification: O(n)

* Worst: [9, 8, 7, 6, 5, 4, 3, 2, 1, 0]
  * Description: An ArrayList of elements in descending order.
  * Reason: This is the worst case because it required the most amount of swaps.
  * Total Comparisons: 45
  * Total Swaps: 45
  * Big-O Classification: O(n<sup>2</sup>)
### Selection Sort:
* Best: [9, 8, 7, 6, 5, 4, 3, 2, 1, 0]; [0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
  * Description: An ArrayList of elements in descending order or of the same elements.
  * Reason: This is the best case(s) because it required the least amount of swaps.
  * Total Comparisons: 55
  * Total Swaps: 9
  * Big-O Classification: O(n<sup>2</sup>)

* Worst: [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
  * Description: An ArrayList of elements in ascending order.
  * Reason: This is the worst case because it required the most amount of swaps.
  * Total Comparisons: 55
  * Total Swaps: 45
  * Big-O Classification: O(n<sup>2</sup>)
### Insertion Sort:
* Best: [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]; [0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
  * Description: An ArrayList of elements in ascending order or of the same elements.
  * Reason: This is the best case(s) because it required no swaps.
  * Total Comparisons: 9
  * Total Swaps: 0
  * Big-O Classification: O(n)

* Worst: [9, 8, 7, 6, 5, 4, 3, 2, 1, 0]
  * Description: An ArrayList of elements in descending order.
  * Reason: This is the worst case because it required the most amount of swaps.
  * Total Comparisons: 45
  * Total Swaps: 45
  * Big-O Classification: O(n<sup>2</sup>)

## Conclusions
### Arrays Populated of the Random Elements:
* For Bubble Sort, the Control takes the same amount of comparisons as the other cases and takes about half of the swaps that were required for the worst case scenario.
* For Selection Sort, the Control takes the same amount of comparisons as the other cases and takes a number of swaps in between the best and worst case scenarios.
* For Insertion Sort, the Control takes a number of comparisons as well as a number of swaps in between the best and worst case scenarios.
### Arrays Populated in Ascending Order:
* This is the best case scenario for Bubble Sort and Insertion Sort, as it required no swaps for both sorts.
* However, Bubble Sort required more comparisons than Insertion Sort, 45 for Bubble Sort and 9 for Insertion Sort, although it being the best case scenario for both sorts.
* Selection Sort the least efficient and has the worst case scenario because it requires the most swaps and comparisons.
### Arrays Populated in Descending Order:
* This is the worst case scenario for Bubble Sort and Insertion Sort, as it requires the most swaps and comparisons for both sorts.
* Selection Sort is the most efficient and has the best case scenario because it requires the least swaps, although it does require the most comparisons.
### Arrays Populated of the Same Element:
* This is the best case scenario for all three sorts, as it required no swaps for Bubble Sort and Insertion Sort, and required the least amount of swaps for Selection Sort.
* While in Selection Sort, it is less efficient than Bubble Sort and Insertion Sort because it still requires swaps even though it would not need swaps theoretically.
### Final Conclusions:
* The most efficient sort overall for the best case scenario is Insertion Sort as it required no swaps and the least amount of comparisons.
* The most efficient sorts for the best case scenarios are Bubble Sort and Insertion Sort because they required no swaps and fewer comparisons.
* Selection Sort is the least efficient in both the best and worst case scenarios because it still requires swaps in the best case scenario and requires the most comparisons both for cases.
