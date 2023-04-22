package j1;

import android.annotation.SuppressLint;
import android.content.IntentFilter;
import android.media.MediaRoute2Info;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

@SuppressLint({"NewApi"})
/* loaded from: classes2.dex */
public class u {
    public static List<String> a(List<MediaRoute2Info> list) {
        return list == null ? new ArrayList() : (List) list.stream().filter(new Predicate() { // from class: j1.t
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return ((MediaRoute2Info) obj) != null;
            }
        }).map(new Function() { // from class: j1.r
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((MediaRoute2Info) obj).getId();
            }
        }).collect(Collectors.toList());
    }

    public static f b(MediaRoute2Info mediaRoute2Info) {
        ArrayList<? extends Parcelable> arrayList = null;
        if (mediaRoute2Info == null) {
            return null;
        }
        String id2 = mediaRoute2Info.getId();
        String charSequence = mediaRoute2Info.getName().toString();
        Bundle bundle = new Bundle();
        bundle.putString("id", id2);
        bundle.putString(AppMeasurementSdk.ConditionalUserProperty.NAME, charSequence);
        bundle.putInt("connectionState", mediaRoute2Info.getConnectionState());
        bundle.putInt("volumeHandling", mediaRoute2Info.getVolumeHandling());
        bundle.putInt("volumeMax", mediaRoute2Info.getVolumeMax());
        bundle.putInt("volume", mediaRoute2Info.getVolume());
        bundle.putBundle("extras", mediaRoute2Info.getExtras());
        bundle.putBoolean("enabled", true);
        bundle.putBoolean("canDisconnect", false);
        CharSequence description = mediaRoute2Info.getDescription();
        if (description != null) {
            bundle.putString("status", description.toString());
        }
        Uri iconUri = mediaRoute2Info.getIconUri();
        if (iconUri != null) {
            bundle.putString("iconUri", iconUri.toString());
        }
        Bundle extras = mediaRoute2Info.getExtras();
        if (extras != null && extras.containsKey("androidx.mediarouter.media.KEY_EXTRAS") && extras.containsKey("androidx.mediarouter.media.KEY_DEVICE_TYPE") && extras.containsKey("androidx.mediarouter.media.KEY_CONTROL_FILTERS")) {
            bundle.putBundle("extras", extras.getBundle("androidx.mediarouter.media.KEY_EXTRAS"));
            bundle.putInt("deviceType", extras.getInt("androidx.mediarouter.media.KEY_DEVICE_TYPE", 0));
            bundle.putInt("playbackType", extras.getInt("androidx.mediarouter.media.KEY_PLAYBACK_TYPE", 1));
            ArrayList<IntentFilter> parcelableArrayList = extras.getParcelableArrayList("androidx.mediarouter.media.KEY_CONTROL_FILTERS");
            if (parcelableArrayList != null && !parcelableArrayList.isEmpty()) {
                loop0: while (true) {
                    for (IntentFilter intentFilter : parcelableArrayList) {
                        if (intentFilter == null) {
                            throw new IllegalArgumentException("filter must not be null");
                        }
                        if (arrayList == null) {
                            arrayList = new ArrayList<>();
                        }
                        if (!arrayList.contains(intentFilter)) {
                            arrayList.add(intentFilter);
                        }
                    }
                }
            }
            if (arrayList != null) {
                bundle.putParcelableArrayList("controlFilters", arrayList);
            }
            return new f(bundle);
        }
        return null;
    }
}
