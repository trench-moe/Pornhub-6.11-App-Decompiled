package android.support.v4.media;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.media.MediaMetadata;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.session.MediaSessionCompat;
import android.text.TextUtils;
import android.util.Log;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class MediaMetadataCompat implements Parcelable {
    public static final Parcelable.Creator<MediaMetadataCompat> CREATOR;

    /* renamed from: m  reason: collision with root package name */
    public static final p.a<String, Integer> f370m;
    public static final String[] n;

    /* renamed from: t  reason: collision with root package name */
    public static final String[] f371t;

    /* renamed from: u  reason: collision with root package name */
    public static final String[] f372u;

    /* renamed from: c  reason: collision with root package name */
    public final Bundle f373c;

    /* renamed from: f  reason: collision with root package name */
    public MediaMetadata f374f;

    /* renamed from: j  reason: collision with root package name */
    public MediaDescriptionCompat f375j;

    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator<MediaMetadataCompat> {
        @Override // android.os.Parcelable.Creator
        public MediaMetadataCompat createFromParcel(Parcel parcel) {
            return new MediaMetadataCompat(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public MediaMetadataCompat[] newArray(int i10) {
            return new MediaMetadataCompat[i10];
        }
    }

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final Bundle f376a;

        public b() {
            this.f376a = new Bundle();
        }

        public b(MediaMetadataCompat mediaMetadataCompat) {
            Bundle bundle = new Bundle(mediaMetadataCompat.f373c);
            this.f376a = bundle;
            MediaSessionCompat.a(bundle);
        }

        public MediaMetadataCompat a() {
            return new MediaMetadataCompat(this.f376a);
        }

        public b b(String str, Bitmap bitmap) {
            p.a<String, Integer> aVar = MediaMetadataCompat.f370m;
            if (!(aVar.e(str) >= 0) || aVar.getOrDefault(str, null).intValue() == 2) {
                this.f376a.putParcelable(str, bitmap);
                return this;
            }
            throw new IllegalArgumentException(android.support.v4.media.b.j("The ", str, " key cannot be used to put a Bitmap"));
        }

        public b c(String str, String str2) {
            p.a<String, Integer> aVar = MediaMetadataCompat.f370m;
            if ((aVar.e(str) >= 0) && aVar.getOrDefault(str, null).intValue() != 1) {
                throw new IllegalArgumentException(android.support.v4.media.b.j("The ", str, " key cannot be used to put a String"));
            }
            this.f376a.putCharSequence(str, str2);
            return this;
        }
    }

    static {
        p.a<String, Integer> aVar = new p.a<>();
        f370m = aVar;
        aVar.put("android.media.metadata.TITLE", 1);
        aVar.put("android.media.metadata.ARTIST", 1);
        aVar.put("android.media.metadata.DURATION", 0);
        aVar.put("android.media.metadata.ALBUM", 1);
        aVar.put("android.media.metadata.AUTHOR", 1);
        aVar.put("android.media.metadata.WRITER", 1);
        aVar.put("android.media.metadata.COMPOSER", 1);
        aVar.put("android.media.metadata.COMPILATION", 1);
        aVar.put("android.media.metadata.DATE", 1);
        aVar.put("android.media.metadata.YEAR", 0);
        aVar.put("android.media.metadata.GENRE", 1);
        aVar.put("android.media.metadata.TRACK_NUMBER", 0);
        aVar.put("android.media.metadata.NUM_TRACKS", 0);
        aVar.put("android.media.metadata.DISC_NUMBER", 0);
        aVar.put("android.media.metadata.ALBUM_ARTIST", 1);
        aVar.put("android.media.metadata.ART", 2);
        aVar.put("android.media.metadata.ART_URI", 1);
        aVar.put("android.media.metadata.ALBUM_ART", 2);
        aVar.put("android.media.metadata.ALBUM_ART_URI", 1);
        aVar.put("android.media.metadata.USER_RATING", 3);
        aVar.put("android.media.metadata.RATING", 3);
        aVar.put("android.media.metadata.DISPLAY_TITLE", 1);
        aVar.put("android.media.metadata.DISPLAY_SUBTITLE", 1);
        aVar.put("android.media.metadata.DISPLAY_DESCRIPTION", 1);
        aVar.put("android.media.metadata.DISPLAY_ICON", 2);
        aVar.put("android.media.metadata.DISPLAY_ICON_URI", 1);
        aVar.put("android.media.metadata.MEDIA_ID", 1);
        aVar.put("android.media.metadata.BT_FOLDER_TYPE", 0);
        aVar.put("android.media.metadata.MEDIA_URI", 1);
        aVar.put("android.media.metadata.ADVERTISEMENT", 0);
        aVar.put("android.media.metadata.DOWNLOAD_STATUS", 0);
        n = new String[]{"android.media.metadata.TITLE", "android.media.metadata.ARTIST", "android.media.metadata.ALBUM", "android.media.metadata.ALBUM_ARTIST", "android.media.metadata.WRITER", "android.media.metadata.AUTHOR", "android.media.metadata.COMPOSER"};
        f371t = new String[]{"android.media.metadata.DISPLAY_ICON", "android.media.metadata.ART", "android.media.metadata.ALBUM_ART"};
        f372u = new String[]{"android.media.metadata.DISPLAY_ICON_URI", "android.media.metadata.ART_URI", "android.media.metadata.ALBUM_ART_URI"};
        CREATOR = new a();
    }

    public MediaMetadataCompat(Bundle bundle) {
        Bundle bundle2 = new Bundle(bundle);
        this.f373c = bundle2;
        MediaSessionCompat.a(bundle2);
    }

    public MediaMetadataCompat(Parcel parcel) {
        this.f373c = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
    }

    public static MediaMetadataCompat a(Object obj) {
        if (obj != null) {
            Parcel obtain = Parcel.obtain();
            MediaMetadata mediaMetadata = (MediaMetadata) obj;
            mediaMetadata.writeToParcel(obtain, 0);
            obtain.setDataPosition(0);
            MediaMetadataCompat createFromParcel = CREATOR.createFromParcel(obtain);
            obtain.recycle();
            createFromParcel.f374f = mediaMetadata;
            return createFromParcel;
        }
        return null;
    }

    public MediaDescriptionCompat b() {
        Bitmap bitmap;
        Uri uri;
        Bitmap bitmap2;
        MediaDescriptionCompat mediaDescriptionCompat = this.f375j;
        if (mediaDescriptionCompat != null) {
            return mediaDescriptionCompat;
        }
        String c10 = c("android.media.metadata.MEDIA_ID");
        CharSequence[] charSequenceArr = new CharSequence[3];
        CharSequence charSequence = this.f373c.getCharSequence("android.media.metadata.DISPLAY_TITLE");
        if (TextUtils.isEmpty(charSequence)) {
            int i10 = 0;
            int i11 = 0;
            while (i10 < 3) {
                String[] strArr = n;
                if (i11 >= strArr.length) {
                    break;
                }
                int i12 = i11 + 1;
                CharSequence d = d(strArr[i11]);
                if (!TextUtils.isEmpty(d)) {
                    charSequenceArr[i10] = d;
                    i10++;
                }
                i11 = i12;
            }
        } else {
            charSequenceArr[0] = charSequence;
            charSequenceArr[1] = this.f373c.getCharSequence("android.media.metadata.DISPLAY_SUBTITLE");
            charSequenceArr[2] = this.f373c.getCharSequence("android.media.metadata.DISPLAY_DESCRIPTION");
        }
        int i13 = 0;
        while (true) {
            String[] strArr2 = f371t;
            if (i13 >= strArr2.length) {
                bitmap = null;
                break;
            }
            try {
                bitmap2 = (Bitmap) this.f373c.getParcelable(strArr2[i13]);
            } catch (Exception e10) {
                Log.w("MediaMetadata", "Failed to retrieve a key as Bitmap.", e10);
                bitmap2 = null;
            }
            if (bitmap2 != null) {
                bitmap = bitmap2;
                break;
            }
            i13++;
        }
        int i14 = 0;
        while (true) {
            String[] strArr3 = f372u;
            if (i14 >= strArr3.length) {
                uri = null;
                break;
            }
            String c11 = c(strArr3[i14]);
            if (!TextUtils.isEmpty(c11)) {
                uri = Uri.parse(c11);
                break;
            }
            i14++;
        }
        String c12 = c("android.media.metadata.MEDIA_URI");
        Uri parse = !TextUtils.isEmpty(c12) ? Uri.parse(c12) : null;
        CharSequence charSequence2 = charSequenceArr[0];
        CharSequence charSequence3 = charSequenceArr[1];
        CharSequence charSequence4 = charSequenceArr[2];
        Bundle bundle = new Bundle();
        if (this.f373c.containsKey("android.media.metadata.BT_FOLDER_TYPE")) {
            bundle.putLong("android.media.extra.BT_FOLDER_TYPE", this.f373c.getLong("android.media.metadata.BT_FOLDER_TYPE", 0L));
        }
        if (this.f373c.containsKey("android.media.metadata.DOWNLOAD_STATUS")) {
            bundle.putLong("android.media.extra.DOWNLOAD_STATUS", this.f373c.getLong("android.media.metadata.DOWNLOAD_STATUS", 0L));
        }
        MediaDescriptionCompat mediaDescriptionCompat2 = new MediaDescriptionCompat(c10, charSequence2, charSequence3, charSequence4, bitmap, uri, bundle.isEmpty() ? null : bundle, parse);
        this.f375j = mediaDescriptionCompat2;
        return mediaDescriptionCompat2;
    }

    public String c(String str) {
        CharSequence charSequence = this.f373c.getCharSequence(str);
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    public CharSequence d(String str) {
        return this.f373c.getCharSequence(str);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeBundle(this.f373c);
    }
}
