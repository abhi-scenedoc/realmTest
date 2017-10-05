# Add project specific ProGuard rules here.
# By default, the flags in this file are appended to flags specified
# in /Users/abhishekpatel/Library/Android/sdk/tools/proguard/proguard-android.txt
# You can edit the include path and order by changing the proguardFiles
# directive in build.gradle.
#
# For more details, see
#   http://developer.android.com/guide/developing/tools/proguard.html

# Add any project specific keep options here:

# If your project uses WebView with JS, uncomment the following
# and specify the fully qualified class name to the JavaScript interface
# class:
#-keepclassmembers class fqcn.of.javascript.interface.for.webview {
#   public *;
#}

# Uncomment this to preserve the line number information for
# debugging stack traces.
#-keepattributes SourceFile,LineNumberTable

# If you keep the line number information, uncomment this to
# hide the original source file name.
#-renamesourcefileattribute SourceFile
# Keep PSPDFKit framework classes – they are already proguarded by default.
-keep class com.pspdfkit.** { *; }

# RxJava is used by PSPDFKit and needs these two lines for proper operation.
-keep class rx.internal.util.unsafe.** { *; }
-dontwarn sun.misc.**

# Optional third party libraries. You can safely ignore those warnings.
-dontwarn com.pspdfkit.ui.PdfYouTubeActivity
-dontwarn com.pspdfkit.media.MediaGalleryView*
-dontwarn com.squareup.okhttp.**
-dontwarn edu.umd.cs.findbugs.**
-dontwarn com.getkeepsafe.relinker.**

# Keep third party lib class names. PSPDFKit relies on those class names to be present.
-keepnames class io.reactivex.android.schedulers.AndroidSchedulers
-keepnames class io.reactivex.Observable
-keepnames class android.support.v7.widget.CardView