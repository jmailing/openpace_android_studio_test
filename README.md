# WORK IN PROGRESS - Not yet functional :(

This project might evolve in a more consequent BAC/PACE passport reader.

For now, my main goal is to be able to compile Open PACE and understand how I can use it in Android Studio.

The idea would be to have a working version of Example.java that can be run from Android Studio.

I will try to make it work and report my findings there. Please feel free to contact me if you have some tips for me, problems when trying to compile or run things.

Last edits:

- Still having issues when trying to run code. The following error occurs even if the file is in the same .jar file
lang.UnsatisfiedLinkError: dlopen failed: could not load library "libcrypto.so.1.0.0" needed by "libeac.so"; caused by library "libcrypto.so.1.0.0" not found

Improvements
- Successful compilation of the latest OpenPACE version for Android. You can refer to the wiki page Compiling-OpenPACE-for-Android that I will try to keep updated with the latest information I find.
- Successful Android Studio's build that packs all of the .so and .so.x.x files into a jar file. Unfortunately, it is not good enough
