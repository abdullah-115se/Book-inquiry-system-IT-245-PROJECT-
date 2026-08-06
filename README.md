# Book Inquiry System

An interactive Java application designed to store, manage, and query book records using data structures. In this project, we compare sequential search, binary search, and hash-indexed lookup algorithms by measuring real-world execution speed ($O(n)$ vs $O(\log n)$ vs $O(1)$) in nanoseconds as the dataset scales.

---

## Group Members & Responsibilities


* **ABDULLAH ALOFAIDLI** — Team Lead & Execution Driver
  * **Assigned File:** `Main.java`
  * **Responsibilities:** Project leadership, GitHub repository administration, nanosecond timing benchmarking suite, and final report synthesis.

* **Ahmed Alzahrani** — Data Model Developer
  * **Assigned Files:** `Book.java` & `DataLoader.java`
  * **Responsibilities:** Core `Book` domain entity design, constructor and getter encapsulation, and automated dataset generator for 1,000+ records.

* **Mohammed Abdullah Alqahtani** — Algorithms Developer (Lists)
  * **Assigned File:** `SearchSolutions.java`
  * **Responsibilities:** Implementation of sequential linear search $O(n)$ and logarithmic binary search $O(\log n)$ algorithms on `ArrayList` collections.

* **Rakan Alotaibi** — Algorithms Developer (Hash Indexing)
  * **Assigned File:** `HashSolutions.java`
  * **Responsibilities:** Direct $O(1)$ `HashMap` search indexing by Title and ISBN, key normalization, and string sanitization.

---

## System Architecture & File Ownership

To keep our Git workflow clean and avoid merge conflicts, we divided our project into 5 dedicated Java files:

1. **`Book.java` (Mohammed Alqahtani):** Represents the `Book` class, including title, author, and ISBN attributes alongside standard getter methods.
2. **`DataLoader.java` (Mohammed Alqahtani):** Generates synthetic dataset records (1,000 books) to provide a sample for testing and benchmarking.
3. **`SearchSolutions.java` (Ahmed Alzahrani):** Handles list-based searches using `ArrayList` specifically sequential Linear Search $O(n)$ and sorted Binary Search $O(\log n)$.
4. **`HashSolutions.java` (Rakan Alotaibi):** Handles instant $O(1)$ `HashMap` lookups by title and ISBN, including text checking to clean up spaces and hyphens.
5. **`Main.java` (Abdullah Alofaidli):** the main execution running all search processes and measuring execution timing in nanoseconds using `System.nanoTime()`.

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

   2. Compile all Java source files:
   ```bash
   javac Book.java DataLoader.java SearchSolutions.java HashSolutions.java Main.java
