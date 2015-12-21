WORK IN PROGRESS

This project might evolve in a more consequent BAC/PACE passport reader. For now, I have had (still do) a few problems for compiling and installing Open PACE and make sure I am able to use it in Android Studio. I will try to make it work and report my findings there.

For the time being, I wm trying to compile with Ubuntu 15.10 I think here are some prerequisites to compile while enabling Python and Java sudo apt-get install automake python-dev libtool help2man gengetopt

And here is the bash script I am using to try to compile (still not working yet)

export MAKE_STANDALONE_TOOLCHAIN="/opt/Sdk/ndk-bundle/build/tools/make-standalone-toolchain.sh"

export ANDROID_ARCH="arm"

git clone https://github.com/frankmorgner/openpace.git

cd openpace

test -x configure || autoreconf --verbose --install

./configure --enable-java --enable-python --enable-openssl-install

make android

exit
