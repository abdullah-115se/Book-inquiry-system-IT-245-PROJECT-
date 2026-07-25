# Book-inquiry-system-IT-245-PROJECT-
A Java-based Book Inquiry System developed to demonstrate and compare searching algorithms across different data structures. Built as a group project.

## 👥 Group Members & Contributions

* **ABDULLAH ALOFAIDLI (Team Lead / Main Driver):** Managed GitHub repo, implemented execution runtime benchmarking in `Main.java`, and authored project documentation.
* **Mohammed alqahtani (Data Model Developer):** Designed and implemented the core `Book.java` class structure.
* **Ahmed alzahrani** Implemented `ArrayList` linear search and `HashMap` direct lookup in `SearchSolutions.java`.

---

## 📊 Algorithmic Complexity Analysis

| Metric | Solution 1: `ArrayList` | Solution 2: `HashMap` |
| :--- | :--- | :--- |
| **Data Structure** | Dynamic Array (`ArrayList`) | Hash Table (`HashMap`) |
| **Search Approach** | Sequential / Linear Search | Key-based Hashing Lookup |
| **Time Complexity (Average)** | $O(n)$ | $O(1)$ |
| **Time Complexity (Worst Case)** | $O(n)$ | $O(n)$ (Rare collision) |
| **Space Complexity** | $O(n)$ | $O(n)$ |