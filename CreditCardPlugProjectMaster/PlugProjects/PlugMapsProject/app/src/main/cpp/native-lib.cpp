#include <jni.h>
#include <string>

extern "C" JNIEXPORT jstring JNICALL
Java_com_freebank_plug_creditcard_plugmapsproject_PluginString_getString(JNIEnv *env, jclass jcls,  jlong time) {

    std::string hello = "这里是so文件中获取的文本!!!";
    return env->NewStringUTF(hello.c_str());
}
