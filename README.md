**Pemrograman Berbasis Obyek Pertemuan Ketiga**:

---

# 📚 Penugasan Pemrograman Berbasis Obyek - Pertemuan Ketiga

**Topik Utama:** Konsep OOP - *Abstract Class*, *Overriding*, dan *Overloading*

---

## 📑 Table of Contents
- [📘 Abstract Class](#abstract-class)
- [🔄 Overriding](#overriding)
- [➕ Overloading](#overloading)
- [🔍 Kesimpulan](#kesimpulan)

---

## 📘 Abstract Class
**Abstract Class** adalah kelas yang bersifat umum dan **tidak dapat diinstansiasi** secara langsung. Kelas ini bertindak sebagai kerangka dasar (*blueprint*) yang digunakan oleh *subclass* untuk mendefinisikan perilaku yang lebih spesifik. Abstract class dapat berisi **abstract method** (tanpa implementasi) dan **concrete method** (dengan implementasi).

### ⚙️ Fitur Abstract Class:
- **Abstract Method:** Method yang hanya dideklarasikan tanpa implementasi, dan **harus** diimplementasikan oleh *subclass*.
- **Concrete Method:** Method yang memiliki implementasi dan bisa digunakan oleh *subclass* tanpa perubahan.

#### ⏰ Kapan Digunakan:
Digunakan saat Anda ingin membuat kelas umum yang **tidak bisa diinstansiasi langsung**, namun membutuhkan subclass untuk mendefinisikan perilaku spesifik.

---

## 🔄 Overriding
**Overriding** terjadi ketika *subclass* mendefinisikan ulang sebuah method yang sudah ada di *parent class* dengan **nama**, **parameter**, dan **tipe return** yang sama. Tujuan dari *overriding* adalah untuk memungkinkan *subclass* menyediakan implementasi yang lebih spesifik atau berbeda dari *parent class*.

### 🔍 Ciri-Ciri Overriding:
- Terjadi di *subclass*.
- Nama method dan parameter **sama** dengan *parent class*.
- Tipe return method **sama** dengan *parent class*.

#### 📌 Kapan Digunakan:
Saat Anda ingin **mengubah** atau **menyesuaikan** perilaku method dari *parent class* di *subclass* untuk kebutuhan tertentu.

---

## ➕ Overloading
**Overloading** adalah kemampuan untuk mendefinisikan beberapa method dengan **nama yang sama** tetapi dengan **parameter** yang berbeda (baik jumlah atau tipe). Dengan *overloading*, kita bisa membuat beberapa method yang melayani fungsi serupa namun dengan variasi input yang berbeda.

### 🔍 Ciri-Ciri Overloading:
- Nama method **sama**.
- Parameter method **berbeda** (baik jumlah, tipe, atau urutannya).
- Tipe return method bisa **sama** atau **berbeda**.

#### 📌 Kapan Digunakan:
Digunakan ketika kita ingin **menyederhanakan kode** dengan memberikan nama method yang sama untuk fungsi serupa tetapi dengan **variasi input** yang berbeda, sehingga kode menjadi lebih konsisten dan mudah dibaca.

---

## 🔍 Kesimpulan
- **Abstract Class** digunakan sebagai **kerangka dasar** yang tidak dapat diinstansiasi dan membutuhkan *subclass* untuk melengkapi perilaku spesifik.
- **Overriding** memungkinkan *subclass* untuk **mengganti** atau **menyesuaikan** method dari *parent class*.
- **Overloading** memungkinkan kita menggunakan **nama yang sama** untuk method dengan berbagai variasi parameter, sehingga kode lebih **rapi** dan **mudah dipelihara**.

---

### 🚀 Selamat Belajar dan Bereksplorasi dengan Konsep OOP! 💻

---
