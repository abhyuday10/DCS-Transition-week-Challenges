#!/bin/bash

# This file must build your code on the DCS systems.
# You may alter this file to use whatever commands you wish on the DCS systems.

javac Sort.java
gcc wc.c -o wc
gcc grep.c -o grep