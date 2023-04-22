package android.support.v4.media.session;

import android.annotation.SuppressLint;
import android.media.session.PlaybackState;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class PlaybackStateCompat implements Parcelable {
    public static final Parcelable.Creator<PlaybackStateCompat> CREATOR = new a();
    public final Bundle A;
    public PlaybackState B;

    /* renamed from: c  reason: collision with root package name */
    public final int f433c;

    /* renamed from: f  reason: collision with root package name */
    public final long f434f;

    /* renamed from: j  reason: collision with root package name */
    public final long f435j;

    /* renamed from: m  reason: collision with root package name */
    public final float f436m;
    public final long n;

    /* renamed from: t  reason: collision with root package name */
    public final int f437t;

    /* renamed from: u  reason: collision with root package name */
    public final CharSequence f438u;

    /* renamed from: w  reason: collision with root package name */
    public final long f439w;
    public List<CustomAction> y;

    /* renamed from: z  reason: collision with root package name */
    public final long f440z;

    /* loaded from: classes.dex */
    public static final class CustomAction implements Parcelable {
        public static final Parcelable.Creator<CustomAction> CREATOR = new a();

        /* renamed from: c  reason: collision with root package name */
        public final String f441c;

        /* renamed from: f  reason: collision with root package name */
        public final CharSequence f442f;

        /* renamed from: j  reason: collision with root package name */
        public final int f443j;

        /* renamed from: m  reason: collision with root package name */
        public final Bundle f444m;
        public PlaybackState.CustomAction n;

        /* loaded from: classes.dex */
        public class a implements Parcelable.Creator<CustomAction> {
            @Override // android.os.Parcelable.Creator
            public CustomAction createFromParcel(Parcel parcel) {
                return new CustomAction(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public CustomAction[] newArray(int i10) {
                return new CustomAction[i10];
            }
        }

        public CustomAction(Parcel parcel) {
            this.f441c = parcel.readString();
            this.f442f = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f443j = parcel.readInt();
            this.f444m = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        }

        public CustomAction(String str, CharSequence charSequence, int i10, Bundle bundle) {
            this.f441c = str;
            this.f442f = charSequence;
            this.f443j = i10;
            this.f444m = bundle;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public String toString() {
            StringBuilder m10 = a1.a.m("Action:mName='");
            m10.append((Object) this.f442f);
            m10.append(", mIcon=");
            m10.append(this.f443j);
            m10.append(", mExtras=");
            m10.append(this.f444m);
            return m10.toString();
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeString(this.f441c);
            TextUtils.writeToParcel(this.f442f, parcel, i10);
            parcel.writeInt(this.f443j);
            parcel.writeBundle(this.f444m);
        }
    }

    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator<PlaybackStateCompat> {
        @Override // android.os.Parcelable.Creator
        public PlaybackStateCompat createFromParcel(Parcel parcel) {
            return new PlaybackStateCompat(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public PlaybackStateCompat[] newArray(int i10) {
            return new PlaybackStateCompat[i10];
        }
    }

    /* loaded from: classes.dex */
    public static class b {
        public static void a(PlaybackState.Builder builder, PlaybackState.CustomAction customAction) {
            builder.addCustomAction(customAction);
        }

        public static PlaybackState.CustomAction b(PlaybackState.CustomAction.Builder builder) {
            return builder.build();
        }

        public static PlaybackState c(PlaybackState.Builder builder) {
            return builder.build();
        }

        public static PlaybackState.Builder d() {
            return new PlaybackState.Builder();
        }

        public static PlaybackState.CustomAction.Builder e(String str, CharSequence charSequence, int i10) {
            return new PlaybackState.CustomAction.Builder(str, charSequence, i10);
        }

        public static String f(PlaybackState.CustomAction customAction) {
            return customAction.getAction();
        }

        public static long g(PlaybackState playbackState) {
            return playbackState.getActions();
        }

        public static long h(PlaybackState playbackState) {
            return playbackState.getActiveQueueItemId();
        }

        public static long i(PlaybackState playbackState) {
            return playbackState.getBufferedPosition();
        }

        public static List<PlaybackState.CustomAction> j(PlaybackState playbackState) {
            return playbackState.getCustomActions();
        }

        public static CharSequence k(PlaybackState playbackState) {
            return playbackState.getErrorMessage();
        }

        public static Bundle l(PlaybackState.CustomAction customAction) {
            return customAction.getExtras();
        }

        public static int m(PlaybackState.CustomAction customAction) {
            return customAction.getIcon();
        }

        public static long n(PlaybackState playbackState) {
            return playbackState.getLastPositionUpdateTime();
        }

        public static CharSequence o(PlaybackState.CustomAction customAction) {
            return customAction.getName();
        }

        public static float p(PlaybackState playbackState) {
            return playbackState.getPlaybackSpeed();
        }

        public static long q(PlaybackState playbackState) {
            return playbackState.getPosition();
        }

        public static int r(PlaybackState playbackState) {
            return playbackState.getState();
        }

        public static void s(PlaybackState.Builder builder, long j10) {
            builder.setActions(j10);
        }

        public static void t(PlaybackState.Builder builder, long j10) {
            builder.setActiveQueueItemId(j10);
        }

        public static void u(PlaybackState.Builder builder, long j10) {
            builder.setBufferedPosition(j10);
        }

        public static void v(PlaybackState.Builder builder, CharSequence charSequence) {
            builder.setErrorMessage(charSequence);
        }

        public static void w(PlaybackState.CustomAction.Builder builder, Bundle bundle) {
            builder.setExtras(bundle);
        }

        public static void x(PlaybackState.Builder builder, int i10, long j10, float f10, long j11) {
            builder.setState(i10, j10, f10, j11);
        }
    }

    /* loaded from: classes.dex */
    public static class c {
        public static Bundle a(PlaybackState playbackState) {
            return playbackState.getExtras();
        }

        public static void b(PlaybackState.Builder builder, Bundle bundle) {
            builder.setExtras(bundle);
        }
    }

    public PlaybackStateCompat(int i10, long j10, long j11, float f10, long j12, int i11, CharSequence charSequence, long j13, List<CustomAction> list, long j14, Bundle bundle) {
        this.f433c = i10;
        this.f434f = j10;
        this.f435j = j11;
        this.f436m = f10;
        this.n = j12;
        this.f437t = i11;
        this.f438u = charSequence;
        this.f439w = j13;
        this.y = new ArrayList(list);
        this.f440z = j14;
        this.A = bundle;
    }

    public PlaybackStateCompat(Parcel parcel) {
        this.f433c = parcel.readInt();
        this.f434f = parcel.readLong();
        this.f436m = parcel.readFloat();
        this.f439w = parcel.readLong();
        this.f435j = parcel.readLong();
        this.n = parcel.readLong();
        this.f438u = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.y = parcel.createTypedArrayList(CustomAction.CREATOR);
        this.f440z = parcel.readLong();
        this.A = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        this.f437t = parcel.readInt();
    }

    public static PlaybackStateCompat a(Object obj) {
        ArrayList arrayList;
        CustomAction customAction;
        Bundle bundle = null;
        if (obj != null) {
            PlaybackState playbackState = (PlaybackState) obj;
            List<PlaybackState.CustomAction> j10 = b.j(playbackState);
            if (j10 != null) {
                ArrayList arrayList2 = new ArrayList(j10.size());
                for (PlaybackState.CustomAction customAction2 : j10) {
                    if (customAction2 != null) {
                        PlaybackState.CustomAction customAction3 = customAction2;
                        Bundle l10 = b.l(customAction3);
                        MediaSessionCompat.a(l10);
                        customAction = new CustomAction(b.f(customAction3), b.o(customAction3), b.m(customAction3), l10);
                        customAction.n = customAction3;
                    } else {
                        customAction = null;
                    }
                    arrayList2.add(customAction);
                }
                arrayList = arrayList2;
            } else {
                arrayList = null;
            }
            if (Build.VERSION.SDK_INT >= 22) {
                bundle = c.a(playbackState);
                MediaSessionCompat.a(bundle);
            }
            PlaybackStateCompat playbackStateCompat = new PlaybackStateCompat(b.r(playbackState), b.q(playbackState), b.i(playbackState), b.p(playbackState), b.g(playbackState), 0, b.k(playbackState), b.n(playbackState), arrayList, b.h(playbackState), bundle);
            playbackStateCompat.B = playbackState;
            return playbackStateCompat;
        }
        return null;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "PlaybackState {state=" + this.f433c + ", position=" + this.f434f + ", buffered position=" + this.f435j + ", speed=" + this.f436m + ", updated=" + this.f439w + ", actions=" + this.n + ", error code=" + this.f437t + ", error message=" + this.f438u + ", custom actions=" + this.y + ", active item id=" + this.f440z + "}";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f433c);
        parcel.writeLong(this.f434f);
        parcel.writeFloat(this.f436m);
        parcel.writeLong(this.f439w);
        parcel.writeLong(this.f435j);
        parcel.writeLong(this.n);
        TextUtils.writeToParcel(this.f438u, parcel, i10);
        parcel.writeTypedList(this.y);
        parcel.writeLong(this.f440z);
        parcel.writeBundle(this.A);
        parcel.writeInt(this.f437t);
    }
}
