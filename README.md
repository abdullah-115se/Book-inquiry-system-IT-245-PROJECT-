# Book Inquiry System

An interactive Java application designed to store, manage, and query book records using data structures. In this project, we compare sequential search, binary search, and hash-indexed lookup algorithms by measuring real-world execution speed ($O(n)$ vs $O(\log n)$ vs $O(1)$) in nanoseconds as the dataset scales.

---

## Group Members & Responsibilities

* **ABDULLAH ALOFAIDLI** — Team Lead and Main Driver
  * **Owned File:** `Main.java`
  * **Key Responsibilities:** Managed GitHub repository, designed execution runtime benchmarking suite in `Main.java`, and created project documentation (`README.md`).

* **Mohammed alqahtani** — Data Model and Storage Developer
  * **Owned Files:** `Book.java` & `DataLoader.java`
  * **Key Responsibilities:** Created `Book.java` class structure, constructor initialization, data getters, and automated large-scale dataset generation (`DataLoader.java`).

* **Ahmed alzahrani** — Sequential and Logarithmic Algorithms Developer
  * **Owned File:** `SearchSolutions.java`
  * **Key Responsibilities:** Implemented $O(n)$ `ArrayList` sequential linear search and $O(\log n)$ binary search on sorted collections in `SearchSolutions.java`.

* **Rakan Alotaibi** — Hash Indexing and Key Sanitization Specialist
  * **Owned File:** `HashSolutions.java`
  * **Key Responsibilities:** Implemented $O(1)$ `HashMap` direct key lookup by Title and ISBN, key normalization, and input sanitization in `HashSolutions.java`.

---

## System Architecture & File Ownership

The project is separated into different files for all 4 members to enable clean team development without Git merge conflicts:

1. **`Book.java` (Domain Model — Mohammed alqahtani):** Encapsulates book attributes (`title`, `author`, `isbn`) with private fields, constructor initialization, getters, and an overridden `toString` representation.
2. **`DataLoader.java` (Data Generator — Mohammed alqahtani):** Generates large-scale synthetic datasets (1,000+ entries) to support Phase 2 scaling and benchmarking experiments.
3. **`SearchSolutions.java` (List Algorithms — Ahmed alzahrani):**
   * **Linear Search ($O(n)$):** Iterates sequentially through an `ArrayList<Book>`.
   * **Binary Search ($O(\log n)$):** Performs logarithmic search on sorted book collections.
4. **`HashSolutions.java` (Hash Indexing — Rakan Alotaibi):**
   * **Title Hash Lookup ($O(1)$):** Utilizes a `HashMap<String, Book>` indexed by normalized lowercase titles.
   * **ISBN Hash Lookup ($O(1)$):** Direct $O(1)$ retrieval using sanitized ISBN keys.
5. **`Main.java` (Driver & Benchmarking — ABDULLAH ALOFAIDLI):** Instantiates datasets, builds indexes, executes search algorithms, and outputs high-precision nanosecond execution metrics (`System.nanoTime()`).

---

## Algorithmic Complexity Comparison

### 1. Linear Search
* **Data Structure:** `ArrayList`
* **Best Case:** $O(1)$
* **Average Case:** $O(n)$
* **Worst Case:** $O(n)$
* **Space Complexity:** $O(n)$

### 2. Binary Search
* **Data Structure:** `ArrayList` (Sorted)
* **Best Case:** $O(1)$
* **Average Case:** $O(\log n)$
* **Worst Case:** $O(\log n)$
* **Space Complexity:** $O(n)$

### 3. Hash Lookup (Title / ISBN)
* **Data Structure:** `HashMap`
* **Best Case:** $O(1)$
* **Average Case:** $O(1)$
* **Worst Case:** $O(n)$ *(Occurs during rare hash collisions)*
* **Space Complexity:** $O(n)$

---

## How to Run

1. **Clone the repository:**
   ```bash
   git clone https://github.com/abdullah-115se/Book-inquiry-system-IT-245-PROJECT-.git
   cd Book-inquiry-system-IT-245-PROJECT-

   2. **Compile all Java source files:**
   ```bash
   javac Book.java DataLoader.java SearchSolutions.java HashSolutions.java Main.java
