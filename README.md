This crash happens when starting the activity on pre-Lollipop devices. Post Lollipop devices do not crash.

This ClassNotFoundException is an incorrect exception but BadParcelableException is correct.

Stacktrace:

```
01-13 13:22:29.657 25750-25750/com.ticketmastermobilestudio.mediacompatcrash E/AndroidRuntime: FATAL EXCEPTION: main
                                                                                               java.lang.RuntimeException: Unable to start activity ComponentInfo{com.ticketmastermobilestudio.mediacompatcrash/com.ticketmastermobilestudio.mediacompatcrash.CrashActivity}: android.os.BadParcelableException: ClassNotFoundException when unmarshalling: ��
                                                                                                   at android.app.ActivityThread.performLaunchActivity(ActivityThread.java:2305)
                                                                                                   at android.app.ActivityThread.handleLaunchActivity(ActivityThread.java:2359)
                                                                                                   at android.app.ActivityThread.access$700(ActivityThread.java:165)
                                                                                                   at android.app.ActivityThread$H.handleMessage(ActivityThread.java:1326)
                                                                                                   at android.os.Handler.dispatchMessage(Handler.java:99)
                                                                                                   at android.os.Looper.loop(Looper.java:137)
                                                                                                   at android.app.ActivityThread.main(ActivityThread.java:5455)
                                                                                                   at java.lang.reflect.Method.invokeNative(Native Method)
                                                                                                   at java.lang.reflect.Method.invoke(Method.java:525)
                                                                                                   at com.android.internal.os.ZygoteInit$MethodAndArgsCaller.run(ZygoteInit.java:1187)
                                                                                                   at com.android.internal.os.ZygoteInit.main(ZygoteInit.java:1003)
                                                                                                   at dalvik.system.NativeStart.main(Native Method)
                                                                                                Caused by: android.os.BadParcelableException: ClassNotFoundException when unmarshalling: ��
                                                                                                   at android.os.Parcel.readParcelableCreator(Parcel.java:2105)
                                                                                                   at android.os.Parcel.readParcelable(Parcel.java:2055)
                                                                                                   at android.support.v4.media.MediaDescriptionCompat.<init>(MediaDescriptionCompat.java:91)
                                                                                                   at android.support.v4.media.MediaDescriptionCompat.<init>(MediaDescriptionCompat.java:32)
                                                                                                   at android.support.v4.media.MediaDescriptionCompat$1.createFromParcel(MediaDescriptionCompat.java:268)
                                                                                                   at android.support.v4.media.MediaDescriptionCompat$1.createFromParcel(MediaDescriptionCompat.java:264)
                                                                                                   at android.support.v4.media.session.MediaSessionCompat$QueueItem.<init>(MediaSessionCompat.java:845)
                                                                                                   at android.support.v4.media.session.MediaSessionCompat$QueueItem.<init>(MediaSessionCompat.java:810)
                                                                                                   at android.support.v4.media.session.MediaSessionCompat$QueueItem$1.createFromParcel(MediaSessionCompat.java:913)
                                                                                                   at android.support.v4.media.session.MediaSessionCompat$QueueItem$1.createFromParcel(MediaSessionCompat.java:909)
                                                                                                   at android.os.Parcel.readParcelable(Parcel.java:2062)
                                                                                                   at android.os.Parcel.readValue(Parcel.java:1971)
                                                                                                   at android.os.Parcel.readMapInternal(Parcel.java:2255)
                                                                                                   at android.os.Bundle.unparcel(Bundle.java:223)
                                                                                                   at android.os.Bundle.getParcelable(Bundle.java:1170)
                                                                                                   at com.ticketmastermobilestudio.mediacompatcrash.CrashActivity.onCreate(CrashActivity.java:15)
                                                                                                   at android.app.Activity.performCreate(Activity.java:5372)
                                                                                                   at android.app.Instrumentation.callActivityOnCreate(Instrumentation.java:1104)
                                                                                                   at android.app.ActivityThread.performLaunchActivity(ActivityThread.java:2267)
                                                                                                   at android.app.ActivityThread.handleLaunchActivity(ActivityThread.java:2359) 
                                                                                                   at android.app.ActivityThread.access$700(ActivityThread.java:165) 
                                                                                                   at android.app.ActivityThread$H.handleMessage(ActivityThread.java:1326) 
                                                                                                   at android.os.Handler.dispatchMessage(Handler.java:99) 
                                                                                                   at android.os.Looper.loop(Looper.java:137) 
                                                                                                   at android.app.ActivityThread.main(ActivityThread.java:5455) 
                                                                                                   at java.lang.reflect.Method.invokeNative(Native Method) 
                                                                                                   at java.lang.reflect.Method.invoke(Method.java:525) 
                                                                                                   at com.android.internal.os.ZygoteInit$MethodAndArgsCaller.run(ZygoteInit.java:1187) 
                                                                                                   at com.android.internal.os.ZygoteInit.main(ZygoteInit.java:1003) 
                                                                                                   at dalvik.system.NativeStart.main(Native Method) 
```