#!/bin/bash
# Script used to fetch and compile openpace
export MAKE_STANDALONE_TOOLCHAIN="/opt/Sdk/ndk-bundle/build/tools/make-standalone-toolchain.sh"
export ANDROID_ARCH="arm"

git clone https://github.com/frankmorgner/openpace.git
cd openpace
#autoreconf --verbose --install
#./configure --enable-java --enable-openssl-install
#make
#
test -x configure || autoreconf --verbose --install
./configure --enable-java --enable-python --enable-openssl-install
make android
exit
