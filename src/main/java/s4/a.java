package s4;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.app.pornhub.R;
import com.app.pornhub.databinding.ItemPornstarBinding;
import com.app.pornhub.domain.config.PerformersConfig;
import com.app.pornhub.domain.model.performer.PerformerMetaData;
import com.app.pornhub.view.home.pornstars.PerformersFragment;
import com.app.pornhub.view.performerdetails.PerformerActivity;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* loaded from: classes2.dex */
public class a extends c4.a<PerformerMetaData> {

    /* renamed from: e  reason: collision with root package name */
    public b f14815e;

    /* renamed from: f  reason: collision with root package name */
    public int f14816f;

    /* renamed from: g  reason: collision with root package name */
    public View.OnClickListener f14817g;

    /* renamed from: s4.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public class View$OnClickListenerC0260a implements View.OnClickListener {
        public View$OnClickListenerC0260a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            String[] split = ((String) view.getTag()).split(",");
            b bVar = a.this.f14815e;
            String str = split[0];
            PerformersConfig.PerformerType deserializePerformerType = PerformersConfig.deserializePerformerType(split[1]);
            PerformersFragment this$0 = (PerformersFragment) ((f) bVar).f14830f;
            KProperty<Object>[] kPropertyArr = PerformersFragment.f5282v0;
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            this$0.I0(PerformerActivity.C(this$0.q(), str, deserializePerformerType));
        }
    }

    /* loaded from: classes2.dex */
    public interface b {
    }

    /* loaded from: classes2.dex */
    public static class c extends RecyclerView.z {

        /* renamed from: u  reason: collision with root package name */
        public final ItemPornstarBinding f14819u;

        public c(ItemPornstarBinding itemPornstarBinding) {
            super(itemPornstarBinding.f4773a);
            this.f14819u = itemPornstarBinding;
        }
    }

    public a(boolean z10, b bVar) {
        super(new ArrayList());
        this.f14817g = new View$OnClickListenerC0260a();
        this.f14815e = bVar;
        this.f14816f = z10 ? R.drawable.pornstar_thumb_male_placeholder : R.drawable.pornstar_thumb_female_placeholder;
    }

    @Override // c4.a
    public void m() {
        this.d.clear();
        this.f2802a.b();
    }

    @Override // c4.a
    public void n(RecyclerView.z zVar, int i10) {
        c cVar = (c) zVar;
        PerformerMetaData performerMetaData = (PerformerMetaData) this.d.get(i10);
        int i11 = this.f14816f;
        View.OnClickListener onClickListener = this.f14817g;
        com.bumptech.glide.b.e(cVar.f14819u.d).o(performerMetaData.getThumb()).j(i11).A(cVar.f14819u.d);
        cVar.f14819u.f4775c.setVisibility(performerMetaData.isVerified() ? 0 : 8);
        cVar.f14819u.f4774b.setVisibility(performerMetaData.getTrophy() ? 0 : 8);
        Context context = cVar.f14819u.f4773a.getContext();
        cVar.f14819u.f4776e.setText(performerMetaData.getName());
        cVar.f14819u.f4778g.setText(context.getResources().getQuantityString(R.plurals.plural_n_videos, performerMetaData.getNumberOfVideos(), a0.b.Y(String.valueOf(performerMetaData.getNumberOfVideos()))));
        cVar.f14819u.f4779h.setText(context.getResources().getQuantityString(R.plurals.plural_n_views, a0.b.g0(performerMetaData.getViews()), a0.b.Y(performerMetaData.getViews())));
        cVar.f14819u.f4777f.setText(performerMetaData.getRank());
        if (performerMetaData.getRating().equals(PerformersConfig.RATING_UP)) {
            cVar.f14819u.f4777f.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.ic_rank_up, 0);
        } else if (performerMetaData.getRating().equals(PerformersConfig.RATING_DOWN)) {
            cVar.f14819u.f4777f.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.ic_rank_down, 0);
        } else {
            cVar.f14819u.f4777f.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
        }
        ConstraintLayout constraintLayout = cVar.f14819u.f4773a;
        constraintLayout.setTag(performerMetaData.getSlug() + "," + performerMetaData.getPerformerType());
        cVar.f14819u.f4773a.setOnClickListener(onClickListener);
    }

    @Override // c4.a
    public RecyclerView.z o(ViewGroup viewGroup, int i10) {
        return new c(ItemPornstarBinding.bind(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_pornstar, viewGroup, false)));
    }
}
