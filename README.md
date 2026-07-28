#  Book Inquiry System 

An interactive Java application designed to store, manage, and query book records using data structures. in this project we compare sequential search, binary search, and hash-indexed lookup algorithms by measuring real-world execution speed ($O(n)$ vs $O(\log n)$ vs $O(1)$) in nanoseconds as the dataset scales.

---

## Group Members & Responsibilities

| Member | Owned File | Key Responsibilities & Module Ownership |
| :--- | :--- | :--- |
| **ABDULLAH ALOFAIDLI (Team Lead / Main Driver)** | `Main.java` | Managed GitHub repository, designed execution runtime benchmarking suite in `Main.java`, and created project documentation (`README.md`). |
| **Mohammed alqahtani (Data Model & Storage Developer)** | `Book.java` & `DataLoader.java` | Created `Book.java` class structure, constructor initialization, data getters, and automated large-scale dataset generation (`DataLoader.java`). |
| **Ahmed alzahrani (Sequential & Logarithmic Algorithms Developer)** | `SearchSolutions.java` | Implemented $O(n)$ `ArrayList` sequential linear search and $O(\log n)$ binary search on sorted collections in `SearchSolutions.java`. |
| **Rakan Alotaibi (Hash Indexing & Key Sanitization Specialist)** | `HashSolutions.java` | Implemented $O(1)$ `HashMap` direct key lookup by Title and ISBN, key normalization, and input sanitization in `HashSolutions.java`. |

---

##  System Architecture & File Ownership

The project is separated to 4 members meaning a file to each member to enable team development without Git merge conflicts:

1. **`Book.java` (Domain Model — Mohammed alqahtani):** Encapsulates book attributes (`title`, `author`, `isbn`) with private fields, constructor initialization, getters, and overridden `toString` representation.
2. **`DataLoader.java` (Data Generator — Mohammed alqahtani):** Generates large-scale synthetic datasets (1,000+ entries) to support Phase 2 scaling and benchmarking experiments.
3. **`SearchSolutions.java` (List Algorithms — Ahmed alzahrani):**
   * **Linear Search ($O(n)$):** Iterates sequentially through an `ArrayList<Book>`.
   * **Binary Search ($O(\log n)$):** Performs logarithmic search on sorted book collections.
4. **`HashSolutions.java` (Hash Indexing — Rakan Alotaibi):**
   * **Title Hash Lookup ($O(1)$):** Utilizes a `HashMap<String, Book>` indexed by normalized lowercase titles.
   * **ISBN Hash Lookup ($O(1)$):** Direct $O(1)$ retrieval using sanitized ISBN keys.
5. **`Main.java` (Driver & Benchmarking — ABDULLAH ALOFAIDLI):** Instantiates datasets, builds indexes, executes search algorithms, and outputs high-precision nanosecond execution metrics (`System.nanoTime()`).

---

##  Algorithmic Complexity Comparison

| Operation | Data Structure | Best Case | Average Case | Worst Case | Space Complexity |
| :--- | :--- | :--- | :--- | :--- | :--- |
| **Linear Search** | `ArrayList` | $O(1)$ | $O(n)$ | $O(n)$ | $O(n)$ |
| **Binary Search** | `ArrayList` (Sorted) | $O(1)$ | $O(\log n)$ | $O(\log n)$ | $O(n)$ |
| **Hash Lookup (Title/ISBN)** | `HashMap` | $O(1)$ | $O(1)$ | $O(n)^*$ | $O(n)$ |

*\* Worst case for HashMap occurs during rare hash collisions.*

---

## Here's how to run 
* **Java Development Kit (JDK 11 or higher)** installed.
* **Git Bash** / Terminal environment.

### Build and Execution Commands

1. **Clone the repository:**
   ```bash
   git clone [https://github.com/YOUR_USERNAME/Book-inquiry-system-IT-245-PROJECT-.git](https://github.com/YOUR_USERNAME/Book-inquiry-system-IT-245-PROJECT-.git)
   cd Book-inquiry-system-IT-245-PROJECT-