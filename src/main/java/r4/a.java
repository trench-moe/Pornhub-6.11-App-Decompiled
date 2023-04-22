package r4;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.b;
import androidx.fragment.app.l;
import com.app.pornhub.R;
import com.app.pornhub.domain.config.PlaylistsConfig;
import com.app.pornhub.view.common.widget.FlowLayout;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lr4/a;", "Landroidx/fragment/app/l;", "<init>", "()V", "Pornhub_6.11.0_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes2.dex */
public final class a extends l {
    public static final /* synthetic */ int E0 = 0;
    public Map<Integer, View> D0 = new LinkedHashMap();

    @Override // androidx.fragment.app.l
    public Dialog M0(Bundle bundle) {
        b.a aVar = new b.a(u0(), R.style.AboutPlaylistDialogStyle);
        aVar.d(R.string.about);
        b.a positiveButton = aVar.setPositiveButton(R.string.ok, w3.d.f16381j);
        boolean z10 = false;
        if (!Intrinsics.areEqual(t0().getString("type"), PlaylistsConfig.TYPE_WATCH_LATER)) {
            t0().getBoolean("curent_user_playlist", false);
        }
        View inflate = View.inflate(u0(), R.layout.dialog_playlist_about, null);
        ((TextView) inflate.findViewById(R.id.pld_about)).setText(t0().getString("title"));
        String string = t0().getString("description");
        TextView textView = (TextView) inflate.findViewById(R.id.pld_description);
        if ((string == null || StringsKt.isBlank(string)) ? true : true) {
            string = "-";
        }
        textView.setText(string);
        ((TextView) inflate.findViewById(R.id.pld_status)).setText(Intrinsics.areEqual(t0().getString("status"), PlaylistsConfig.TYPE_PRIVATE) ? I(R.string._private) : I(R.string._public));
        String[] stringArray = t0().getStringArray("tags");
        if (stringArray != null) {
            FlowLayout flowLayout = (FlowLayout) inflate.findViewById(R.id.pld_tags_layout);
            Iterator it = ArrayIteratorKt.iterator(stringArray);
            while (it.hasNext()) {
                String str = (String) it.next();
                View inflate2 = View.inflate(u0(), R.layout.item_tag_playlist_editable, null);
                ((ImageView) inflate2.findViewById(R.id.tag_remove_icon)).setVisibility(8);
                ((TextView) inflate2.findViewById(R.id.tag_name)).setText(str);
                flowLayout.addView(inflate2);
            }
        }
        positiveButton.setView(inflate);
        androidx.appcompat.app.b create = positiveButton.create();
        Intrinsics.checkNotNullExpressionValue(create, "builder.create()");
        return create;
    }

    @Override // androidx.fragment.app.l, androidx.fragment.app.Fragment
    public void Y() {
        super.Y();
        this.D0.clear();
    }
}
