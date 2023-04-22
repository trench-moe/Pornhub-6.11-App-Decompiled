package c4;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import c4.j;
import com.app.pornhub.R;
import com.app.pornhub.databinding.ItemLayoutVideoBinding;
import com.app.pornhub.domain.model.video.VideoMetaData;
import t3.o;

/* loaded from: classes.dex */
public class l extends j {

    /* loaded from: classes.dex */
    public static class a extends RecyclerView.z {

        /* renamed from: u  reason: collision with root package name */
        public ItemLayoutVideoBinding f3760u;

        public a(ItemLayoutVideoBinding itemLayoutVideoBinding) {
            super(itemLayoutVideoBinding.f4725a);
            this.f3760u = itemLayoutVideoBinding;
        }
    }

    public l(j.b bVar) {
        super(bVar);
    }

    @Override // c4.a
    public void n(RecyclerView.z zVar, int i10) {
        a aVar = (a) zVar;
        VideoMetaData videoMetaData = (VideoMetaData) this.d.get(i10);
        aVar.f3760u.f4729f.setVisibility(8);
        com.bumptech.glide.b.e(aVar.f3760u.f4728e).o(videoMetaData.getUrlThumbnail()).j(R.drawable.thumb_preview).A(aVar.f3760u.f4728e);
        o.b(videoMetaData.getVideoContentType(), aVar.f3760u.f4727c);
        TextView textView = aVar.f3760u.f4734k;
        o oVar = o.f15126a;
        textView.setText(o.k(textView.getContext(), videoMetaData));
        aVar.f3760u.f4726b.setVisibility(videoMetaData.isPaid() ? 0 : 8);
        o.o(videoMetaData, aVar.f3760u.d);
        aVar.f3760u.f4731h.setText(videoMetaData.getUserMetaData().getUsername());
        aVar.f3760u.f4732i.setText(a0.b.y(videoMetaData.getDuration() * 1000));
        aVar.f3760u.f4733j.setText(videoMetaData.getTitle());
        aVar.f3760u.f4735l.setText(a0.b.u(videoMetaData.getViewCount()));
        aVar.f3760u.f4730g.setText(a0.b.z(videoMetaData.getRating()));
        aVar.f3760u.f4725a.setTag(((VideoMetaData) this.d.get(i10)).getVkey());
        ItemLayoutVideoBinding itemLayoutVideoBinding = aVar.f3760u;
        itemLayoutVideoBinding.f4725a.setOnTouchListener(new j.c(i10, itemLayoutVideoBinding.f4729f, itemLayoutVideoBinding.f4728e));
    }

    @Override // c4.a
    public RecyclerView.z o(ViewGroup viewGroup, int i10) {
        return new a(ItemLayoutVideoBinding.a(LayoutInflater.from(viewGroup.getContext()), viewGroup, false));
    }
}
