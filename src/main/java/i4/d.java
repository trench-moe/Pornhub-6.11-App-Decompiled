package i4;

import android.view.View;
import android.widget.Spinner;
import com.app.pornhub.R;
import com.app.pornhub.databinding.ItemPlaylistBindingBinding;
import com.app.pornhub.domain.model.photo.AlbumFilters;
import com.app.pornhub.domain.model.playlist.Playlist;
import com.app.pornhub.domain.model.video.VideoMetaData;
import com.app.pornhub.view.browser.BrowserActivity;
import com.app.pornhub.view.home.explore.adapter.ExploreCategoryAdapter;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import q4.d;
import r4.c;

/* loaded from: classes2.dex */
public final /* synthetic */ class d implements View.OnClickListener {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f10503c;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ Object f10504f;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ Object f10505j;

    public /* synthetic */ d(Object obj, Object obj2, int i10) {
        this.f10503c = i10;
        this.f10504f = obj;
        this.f10505j = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Function2<Playlist, r4.c, Unit> function2;
        switch (this.f10503c) {
            case 0:
                e eVar = (e) this.f10504f;
                Spinner spinner = (Spinner) this.f10505j;
                String str = e.K0;
                if (eVar.f2019u.getBoolean("search_mode")) {
                    String tag = eVar.J0.getTag();
                    AlbumFilters g10 = eVar.G0.f10492a.g();
                    eVar.J0 = g10;
                    g10.setTag(tag);
                } else {
                    eVar.J0 = eVar.G0.f10492a.g();
                }
                j jVar = eVar.H0;
                List<Integer> segmentSelection = eVar.J0.getSegmentSelection();
                Objects.requireNonNull(jVar);
                jVar.f10524f = new ArrayList<>(segmentSelection);
                jVar.notifyDataSetChanged();
                int position = eVar.I0.getPosition(eVar.J0.getTag());
                if (position == -1) {
                    position = 0;
                }
                spinner.setSelection(position, false);
                return;
            case 1:
                ExploreCategoryAdapter this$0 = (ExploreCategoryAdapter) this.f10504f;
                ExploreCategoryAdapter.Item item = (ExploreCategoryAdapter.Item) this.f10505j;
                int i10 = ExploreCategoryAdapter.a.f5193x;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(item, "$item");
                o4.d dVar = this$0.f5190h;
                if (dVar == null) {
                    return;
                }
                dVar.c(((ExploreCategoryAdapter.Item.CategoryItem) item).a());
                return;
            case 2:
                q4.d this$02 = (q4.d) this.f10504f;
                d.e item2 = (d.e) this.f10505j;
                int i11 = d.h.f14359w;
                Intrinsics.checkNotNullParameter(this$02, "this$0");
                Intrinsics.checkNotNullParameter(item2, "$item");
                d.a aVar = this$02.f14349m;
                if (aVar == null) {
                    return;
                }
                aVar.a(item2.f14356c);
                return;
            case 3:
                ItemPlaylistBindingBinding binding = (ItemPlaylistBindingBinding) this.f10504f;
                r4.e this$03 = (r4.e) this.f10505j;
                Intrinsics.checkNotNullParameter(binding, "$binding");
                Intrinsics.checkNotNullParameter(this$03, "this$0");
                Playlist playlist = binding.f4758x;
                if (playlist != null && (function2 = this$03.f14663f) != null) {
                    function2.invoke(playlist, c.b.f14657a);
                    return;
                }
                return;
            default:
                com.app.pornhub.view.videodetails.c cVar = (com.app.pornhub.view.videodetails.c) this.f10504f;
                VideoMetaData videoMetaData = (VideoMetaData) this.f10505j;
                int i12 = com.app.pornhub.view.videodetails.c.C0;
                cVar.I0(BrowserActivity.B(cVar.s0(), videoMetaData.getChannelLink(), String.format(cVar.I(R.string.join_x), videoMetaData.getChannelTitle())));
                return;
        }
    }
}
