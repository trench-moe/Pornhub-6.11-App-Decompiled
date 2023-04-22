package a5;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.o;
import androidx.recyclerview.widget.RecyclerView;
import com.app.pornhub.R;
import com.app.pornhub.domain.model.photo.Photo;
import com.app.pornhub.view.common.widget.AlbumPhotoImageViewCustom;
import com.app.pornhub.view.photos.PhotoDisplayActivity;
import com.bumptech.glide.f;
import com.bumptech.glide.load.resource.bitmap.DownsampleStrategy;
import java.util.ArrayList;
import java.util.Objects;
import q5.h;
import q5.m;

/* loaded from: classes.dex */
public class d extends c4.a<Photo> {

    /* renamed from: e  reason: collision with root package name */
    public a f186e;

    /* loaded from: classes.dex */
    public interface a {
    }

    /* loaded from: classes.dex */
    public static class b extends RecyclerView.z {

        /* renamed from: u  reason: collision with root package name */
        public AlbumPhotoImageViewCustom f187u;

        public b(View view) {
            super(view);
            this.f187u = (AlbumPhotoImageViewCustom) view.findViewById(R.id.fragment_photos_tile_imgThumbnail);
        }
    }

    /* loaded from: classes.dex */
    public class c implements View.OnClickListener {

        /* renamed from: c  reason: collision with root package name */
        public int f188c;

        public c(int i10) {
            this.f188c = i10;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            a aVar = d.this.f186e;
            int i10 = this.f188c;
            e eVar = (e) aVar;
            o n = eVar.n();
            Bundle bundle = eVar.f2019u;
            int i11 = PhotoDisplayActivity.K;
            Intent intent = new Intent(n, PhotoDisplayActivity.class);
            bundle.putInt("photo_index", i10);
            intent.putExtra("bundle", bundle);
            eVar.I0(intent);
            t3.a.y("photo_grid");
        }
    }

    public d(a aVar) {
        super(new ArrayList());
        this.f186e = aVar;
    }

    @Override // c4.a
    public void n(RecyclerView.z zVar, int i10) {
        b bVar = (b) zVar;
        f j10 = com.bumptech.glide.b.e(bVar.f187u).o(((Photo) this.d.get(i10)).getUrlThumbnail()).j(R.drawable.thumb_preview);
        Objects.requireNonNull(j10);
        f q10 = j10.q(DownsampleStrategy.f5838a, new m());
        q10.O = true;
        q10.q(DownsampleStrategy.f5840c, new h()).A(bVar.f187u);
        bVar.f187u.setOnClickListener(new c(i10));
    }

    @Override // c4.a
    public RecyclerView.z o(ViewGroup viewGroup, int i10) {
        return new b(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.photos_tile, viewGroup, false));
    }
}
