/*
String stores text or sequence of characters and surrounded by double quotes.String is immutable.
for example:
String s="Hello World";
Some methods are there in String like join,split,contains,concat etc.

String is immutable if you modify the String the new 
modified string was located in new memory address the 
old String was stored in the last memory address it was no longer 
use collected by Garbage Collector.


String contains internal memory organizer that is String pool.String pool is inside the JVM's Heap memory.It stores 
same values in same memory address but the obj is different it stores different memory location.

String have two advanced types that is String buffer and builder that was used to mutable the String.
these are have some methods like append,insert,delete,capacity,reverse,length etc.
String buffer is synchronized and thread safe so it runs slow because of overhead, it was introduced in java 1.but the builder is 
fast it no thread safety and non synchronized so it runs fast it was introduced in java 5. 

*/