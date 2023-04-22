package m4;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.app.pornhub.R;
import com.app.pornhub.databinding.ItemDvdBinding;
import com.app.pornhub.domain.model.dvd.Dvd;
import com.app.pornhub.view.channeldetails.ChannelActivity;
import com.app.pornhub.view.dvddetails.DvdActivity;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public class c extends c4.a<Dvd> {

    /* renamed from: e  reason: collision with root package name */
    public b f12895e;

    /* renamed from: f  reason: collision with root package name */
    public View.OnClickListener f12896f;

    /* renamed from: g  reason: collision with root package name */
    public View.OnClickListener f12897g;

    /* loaded from: classes2.dex */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            d dVar = (d) c.this.f12895e;
            Context q10 = dVar.q();
            int i10 = DvdActivity.K;
            Intent intent = new Intent();
            intent.setClass(q10, DvdActivity.class);
            intent.putExtra("id", (String) view.getTag());
            dVar.I0(intent);
        }
    }

    /* loaded from: classes2.dex */
    public interface b {
    }

    /* renamed from: m4.c$c  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static class C0206c extends RecyclerView.z {

        /* renamed from: u  reason: collision with root package name */
        public final ItemDvdBinding f12899u;

        public C0206c(ItemDvdBinding itemDvdBinding) {
            super(itemDvdBinding.f4715a);
            this.f12899u = itemDvdBinding;
        }
    }

    public c(b bVar) {
        super(new ArrayList());
        this.f12896f = new a();
        this.f12897g = new View.OnClickListener() { // from class: m4.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                view.getContext().startActivity(ChannelActivity.C(view.getContext(), (String) view.getTag()));
            }
        };
        this.f12895e = bVar;
    }

    @Override // c4.a
    public void n(RecyclerView.z zVar, int i10) {
        C0206c c0206c = (C0206c) zVar;
        Dvd dvd = (Dvd) this.d.get(i10);
        View.OnClickListener onClickListener = this.f12896f;
        View.OnClickListener onClickListener2 = this.f12897g;
        com.bumptech.glide.b.e(c0206c.f12899u.f4717c).o(dvd.getCover()).j(R.drawable.dvd_cover_placeholder).A(c0206c.f12899u.f4717c);
        c0206c.f12899u.f4718e.setVisibility(dvd.isPremium() ? 0 : 4);
        c0206c.f12899u.f4719f.setVisibility(dvd.isHd() ? 0 : 4);
        c0206c.f12899u.d.setText(dvd.getTitle());
        c0206c.f12899u.f4720g.setText(a0.b.Y(dvd.getVideosCount()));
        c0206c.f12899u.f4721h.setText(a0.b.Y(dvd.getViewsCount()));
        c0206c.f12899u.f4716b.setText(dvd.getFromChannel());
        c0206c.f12899u.f4716b.setTag(dvd.getChannelId());
        c0206c.f12899u.f4716b.setOnClickListener(onClickListener2);
        c0206c.f12899u.f4715a.setTag(String.valueOf(dvd.getId()));
        c0206c.f12899u.f4715a.setOnClickListener(onClickListener);
    }

    @Override // c4.a
    public RecyclerView.z o(ViewGroup viewGroup, int i10) {
        return new C0206c(ItemDvdBinding.bind(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_dvd, viewGroup, false)));
    }
}
