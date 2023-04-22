package com.app.pornhub.view.editplaylist;

import android.content.Context;
import android.content.Intent;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import v3.b;

@Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/app/pornhub/view/editplaylist/EditPlaylistActivity;", "Lv3/b;", "<init>", "()V", "Pornhub_6.11.0_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class EditPlaylistActivity extends b {
    public EditPlaylistActivity() {
        new LinkedHashMap();
    }

    @JvmStatic
    public static final Intent C(Context context, long j10, String str) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intent intent = new Intent(context, EditPlaylistActivity.class);
        intent.putExtra("playlist_id", j10);
        if (str != null) {
            intent.putExtra("vkey", str);
        }
        return intent;
    }
}
