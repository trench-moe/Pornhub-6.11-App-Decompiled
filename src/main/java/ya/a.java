package ya;

import android.content.ContentResolver;
import android.provider.Settings;

/* loaded from: classes2.dex */
public class a {
    public float a(ContentResolver contentResolver) {
        return Settings.Global.getFloat(contentResolver, "animator_duration_scale", 1.0f);
    }
}
