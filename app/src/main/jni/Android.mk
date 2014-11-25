LOCAL_PATH := $(call my-dir)

include $(CLEAR_VARS)

LOCAL_CFLAGS      := -O3 -fstrict-aliasing -ffast-math -funroll-loops
LOCAL_ARM_MODE    := arm

LOCAL_SRC_FILES   := main.cpp

LOCAL_MODULE      := libPlayground
LOCAL_MODULE_TAGS := optional

include $(BUILD_SHARED_LIBRARY)
