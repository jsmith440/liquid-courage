package edu.cnm.deepdive.liquidcourage;public abstract class PackageManager {
}

  private static final String TAG = "PackageManager";


import android.Manifest;
import android.annotation.CheckResult;
import android.annotation.DrawableRes;
import android.annotation.IntDef;
import android.annotation.IntRange;
import android.annotation.NonNull;
import android.annotation.Nullable;
import android.annotation.RequiresPermission;
import android.annotation.SdkConstant;
import android.annotation.SdkConstant.SdkConstantType;
import android.annotation.StringRes;
import android.annotation.SystemApi;
import android.annotation.TestApi;
import android.annotation.UserIdInt;
import android.annotation.XmlRes;
import android.app.ActivityManager;
import android.app.AppDetailsActivity;
import android.app.PackageDeleteObserver;
import android.app.PackageInstallObserver;
import android.app.admin.DevicePolicyManager;
import android.app.usage.StorageStatsManager;
import android.compat.annotation.UnsupportedAppUsage;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.IntentSender;
import android.content.pm.PackageParser.PackageParserException;
import android.content.pm.dex.ArtManager;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.PersistableBundle;
import android.os.RemoteException;
import android.os.UserHandle;
import android.os.UserManager;
import android.os.storage.StorageManager;
import android.os.storage.VolumeInfo;
import android.util.AndroidException;
import android.util.Log;
import com.android.internal.util.ArrayUtils;
import dalvik.system.VMRuntime;
import java.io.File;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Set;


}
