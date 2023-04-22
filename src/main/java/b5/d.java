package b5;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.e0;
import androidx.recyclerview.widget.RecyclerView;
import b5.d;
import c4.j;
import com.app.pornhub.R;
import com.app.pornhub.databinding.ItemPlaylistVideoBinding;
import com.app.pornhub.domain.model.video.VideoContentType;
import com.app.pornhub.domain.model.video.VideoMetaData;
import kotlin.jvm.internal.Intrinsics;
import t3.o;

/* loaded from: classes.dex */
public final class d extends j {

    /* renamed from: h  reason: collision with root package name */
    public final c f3578h;

    /* renamed from: i  reason: collision with root package name */
    public final a f3579i;

    /* loaded from: classes.dex */
    public interface a {
    }

    /* loaded from: classes.dex */
    public final class b extends RecyclerView.z {

        /* renamed from: u  reason: collision with root package name */
        public final ItemPlaylistVideoBinding f3580u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(d this$0, ItemPlaylistVideoBinding binding) {
            super(binding.f4761a);
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(binding, "binding");
            this.f3580u = binding;
        }
    }

    /* loaded from: classes.dex */
    public interface c extends j.b {
        void e(VideoMetaData videoMetaData);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(c videoCallback, a actionCallback) {
        super(videoCallback);
        Intrinsics.checkNotNullParameter(videoCallback, "videoCallback");
        Intrinsics.checkNotNullParameter(actionCallback, "actionCallback");
        this.f3578h = videoCallback;
        this.f3579i = actionCallback;
    }

    @Override // c4.a
    public void n(RecyclerView.z zVar, final int i10) {
        VideoMetaData videoMetaData = (VideoMetaData) this.d.get(i10);
        if (videoMetaData == null) {
            return;
        }
        b bVar = zVar instanceof b ? (b) zVar : null;
        final ItemPlaylistVideoBinding itemPlaylistVideoBinding = bVar != null ? bVar.f3580u : null;
        if (itemPlaylistVideoBinding == null) {
            return;
        }
        com.bumptech.glide.b.e(itemPlaylistVideoBinding.f4764e).o(videoMetaData.getUrlThumbnail()).j(R.drawable.thumb_preview).A(itemPlaylistVideoBinding.f4764e);
        VideoContentType videoContentType = videoMetaData.getVideoContentType();
        ImageView imageView = itemPlaylistVideoBinding.f4763c;
        Intrinsics.checkNotNullExpressionValue(imageView, "itemBinding.icPremium");
        o.b(videoContentType, imageView);
        itemPlaylistVideoBinding.f4762b.setVisibility(videoMetaData.isPaid() ? 0 : 8);
        ImageView imageView2 = itemPlaylistVideoBinding.d;
        Intrinsics.checkNotNullExpressionValue(imageView2, "itemBinding.imageViewUploaderType");
        o.o(videoMetaData, imageView2);
        TextView textView = itemPlaylistVideoBinding.f4770k;
        o oVar = o.f15126a;
        Context context = textView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "itemBinding.videoType.context");
        textView.setText(o.k(context, videoMetaData));
        itemPlaylistVideoBinding.f4769j.setText(videoMetaData.getTitle());
        itemPlaylistVideoBinding.f4768i.setText(a0.b.y(videoMetaData.getDuration() * 1000));
        itemPlaylistVideoBinding.f4771l.setText(a0.b.u(videoMetaData.getViewCount()));
        itemPlaylistVideoBinding.f4767h.setText(a0.b.u(videoMetaData.getRating()));
        itemPlaylistVideoBinding.f4761a.setTag(videoMetaData);
        itemPlaylistVideoBinding.f4761a.setOnTouchListener(new j.c(i10, itemPlaylistVideoBinding.f4766g, itemPlaylistVideoBinding.f4764e));
        itemPlaylistVideoBinding.f4765f.setOnClickListener(new View.OnClickListener() { // from class: b5.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ItemPlaylistVideoBinding itemBinding = ItemPlaylistVideoBinding.this;
                final d this$0 = this;
                final int i11 = i10;
                Intrinsics.checkNotNullParameter(itemBinding, "$itemBinding");
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                e0 e0Var = new e0(new j.c(itemBinding.f4761a.getContext(), (int) R.style.PlaylistOptionsPopupMenu), itemBinding.f4765f);
                e0Var.a(R.menu.menu_playlist_video);
                e0Var.d = new e0.a() { // from class: b5.c
                    @Override // androidx.appcompat.widget.e0.a
                    public final boolean onMenuItemClick(MenuItem menuItem) {
                        d this$02 = d.this;
                        int i12 = i11;
                        Intrinsics.checkNotNullParameter(this$02, "this$0");
                        if (menuItem.getItemId() == R.id.share) {
                            d.c cVar = this$02.f3578h;
                            Object obj = this$02.d.get(i12);
                            Intrinsics.checkNotNullExpressionValue(obj, "dataset[position]");
                            cVar.e((VideoMetaData) obj);
                        }
                        return true;
                    }
                };
                e0Var.b();
            }
        });
    }

    @Override // c4.a
    public RecyclerView.z o(ViewGroup parent, int i10) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        ItemPlaylistVideoBinding bind = ItemPlaylistVideoBinding.bind(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_playlist_video, parent, false));
        Intrinsics.checkNotNullExpressionValue(bind, "inflate(\n               …      false\n            )");
        return new b(this, bind);
    }
}
