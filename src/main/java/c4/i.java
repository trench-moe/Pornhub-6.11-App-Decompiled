package c4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import c4.h;
import com.app.pornhub.R;
import com.app.pornhub.databinding.ItemGifListBinding;
import com.app.pornhub.domain.model.gif.GifMetaData;

/* loaded from: classes.dex */
public class i extends h {

    /* renamed from: e  reason: collision with root package name */
    public final h.a f3744e;

    /* renamed from: f  reason: collision with root package name */
    public final View.OnClickListener f3745f = new a();

    /* loaded from: classes.dex */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            i.this.f3744e.h((String) view.getTag());
        }
    }

    /* loaded from: classes.dex */
    public static class b extends RecyclerView.z {

        /* renamed from: u  reason: collision with root package name */
        public final ItemGifListBinding f3747u;

        public b(ItemGifListBinding itemGifListBinding) {
            super(itemGifListBinding.f4722a);
            this.f3747u = itemGifListBinding;
        }
    }

    public i(h.a aVar) {
        this.f3744e = aVar;
    }

    @Override // c4.a
    public void n(RecyclerView.z zVar, int i10) {
        b bVar = (b) zVar;
        GifMetaData gifMetaData = (GifMetaData) this.d.get(i10);
        View.OnClickListener onClickListener = this.f3745f;
        com.bumptech.glide.b.e(bVar.f3747u.f4723b).o(gifMetaData.getUrlThumbnail()).j(R.drawable.thumb_preview).A(bVar.f3747u.f4723b);
        bVar.f3747u.f4724c.setText(gifMetaData.getTitle());
        bVar.f3747u.f4722a.setTag(gifMetaData.getId());
        bVar.f3747u.f4722a.setOnClickListener(onClickListener);
    }

    @Override // c4.a
    public RecyclerView.z o(ViewGroup viewGroup, int i10) {
        return new b(ItemGifListBinding.bind(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_gif_list, viewGroup, false)));
    }
}
