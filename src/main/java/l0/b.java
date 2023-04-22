package l0;

import android.os.Build;
import android.text.PrecomputedText;
import android.text.Spannable;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import java.util.Objects;

/* loaded from: classes2.dex */
public class b implements Spannable {

    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final TextPaint f12166a;

        /* renamed from: b  reason: collision with root package name */
        public final TextDirectionHeuristic f12167b;

        /* renamed from: c  reason: collision with root package name */
        public final int f12168c;
        public final int d;

        public a(PrecomputedText.Params params) {
            this.f12166a = params.getTextPaint();
            this.f12167b = params.getTextDirection();
            this.f12168c = params.getBreakStrategy();
            this.d = params.getHyphenationFrequency();
        }

        public a(TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic, int i10, int i11) {
            if (Build.VERSION.SDK_INT >= 29) {
                new PrecomputedText.Params.Builder(textPaint).setBreakStrategy(i10).setHyphenationFrequency(i11).setTextDirection(textDirectionHeuristic).build();
            }
            this.f12166a = textPaint;
            this.f12167b = textDirectionHeuristic;
            this.f12168c = i10;
            this.d = i11;
        }

        public boolean a(a aVar) {
            int i10 = Build.VERSION.SDK_INT;
            if ((i10 < 23 || (this.f12168c == aVar.f12168c && this.d == aVar.d)) && this.f12166a.getTextSize() == aVar.f12166a.getTextSize() && this.f12166a.getTextScaleX() == aVar.f12166a.getTextScaleX() && this.f12166a.getTextSkewX() == aVar.f12166a.getTextSkewX() && this.f12166a.getLetterSpacing() == aVar.f12166a.getLetterSpacing() && TextUtils.equals(this.f12166a.getFontFeatureSettings(), aVar.f12166a.getFontFeatureSettings()) && this.f12166a.getFlags() == aVar.f12166a.getFlags()) {
                if (i10 >= 24) {
                    if (!this.f12166a.getTextLocales().equals(aVar.f12166a.getTextLocales())) {
                        return false;
                    }
                } else if (!this.f12166a.getTextLocale().equals(aVar.f12166a.getTextLocale())) {
                    return false;
                }
                if (this.f12166a.getTypeface() == null) {
                    if (aVar.f12166a.getTypeface() != null) {
                        return false;
                    }
                } else if (!this.f12166a.getTypeface().equals(aVar.f12166a.getTypeface())) {
                    return false;
                }
                return true;
            }
            return false;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof a) {
                a aVar = (a) obj;
                return a(aVar) && this.f12167b == aVar.f12167b;
            }
            return false;
        }

        public int hashCode() {
            return Build.VERSION.SDK_INT >= 24 ? Objects.hash(Float.valueOf(this.f12166a.getTextSize()), Float.valueOf(this.f12166a.getTextScaleX()), Float.valueOf(this.f12166a.getTextSkewX()), Float.valueOf(this.f12166a.getLetterSpacing()), Integer.valueOf(this.f12166a.getFlags()), this.f12166a.getTextLocales(), this.f12166a.getTypeface(), Boolean.valueOf(this.f12166a.isElegantTextHeight()), this.f12167b, Integer.valueOf(this.f12168c), Integer.valueOf(this.d)) : Objects.hash(Float.valueOf(this.f12166a.getTextSize()), Float.valueOf(this.f12166a.getTextScaleX()), Float.valueOf(this.f12166a.getTextSkewX()), Float.valueOf(this.f12166a.getLetterSpacing()), Integer.valueOf(this.f12166a.getFlags()), this.f12166a.getTextLocale(), this.f12166a.getTypeface(), Boolean.valueOf(this.f12166a.isElegantTextHeight()), this.f12167b, Integer.valueOf(this.f12168c), Integer.valueOf(this.d));
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("{");
            StringBuilder m10 = a1.a.m("textSize=");
            m10.append(this.f12166a.getTextSize());
            sb2.append(m10.toString());
            sb2.append(", textScaleX=" + this.f12166a.getTextScaleX());
            sb2.append(", textSkewX=" + this.f12166a.getTextSkewX());
            int i10 = Build.VERSION.SDK_INT;
            StringBuilder m11 = a1.a.m(", letterSpacing=");
            m11.append(this.f12166a.getLetterSpacing());
            sb2.append(m11.toString());
            sb2.append(", elegantTextHeight=" + this.f12166a.isElegantTextHeight());
            if (i10 >= 24) {
                StringBuilder m12 = a1.a.m(", textLocale=");
                m12.append(this.f12166a.getTextLocales());
                sb2.append(m12.toString());
            } else {
                StringBuilder m13 = a1.a.m(", textLocale=");
                m13.append(this.f12166a.getTextLocale());
                sb2.append(m13.toString());
            }
            StringBuilder m14 = a1.a.m(", typeface=");
            m14.append(this.f12166a.getTypeface());
            sb2.append(m14.toString());
            if (i10 >= 26) {
                StringBuilder m15 = a1.a.m(", variationSettings=");
                m15.append(this.f12166a.getFontVariationSettings());
                sb2.append(m15.toString());
            }
            StringBuilder m16 = a1.a.m(", textDir=");
            m16.append(this.f12167b);
            sb2.append(m16.toString());
            sb2.append(", breakStrategy=" + this.f12168c);
            sb2.append(", hyphenationFrequency=" + this.d);
            sb2.append("}");
            return sb2.toString();
        }
    }

    @Override // java.lang.CharSequence
    public char charAt(int i10) {
        throw null;
    }

    @Override // android.text.Spanned
    public int getSpanEnd(Object obj) {
        throw null;
    }

    @Override // android.text.Spanned
    public int getSpanFlags(Object obj) {
        throw null;
    }

    @Override // android.text.Spanned
    public int getSpanStart(Object obj) {
        throw null;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:202)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:45)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    @Override // android.text.Spanned
    public <T> T[] getSpans(int r4, int r5, java.lang.Class<T> r6) {
        /*
            r3 = this;
            r0 = r3
            int r4 = android.os.Build.VERSION.SDK_INT
            r2 = 1
            r2 = 0
            r5 = r2
            r6 = 29
            r2 = 7
            if (r4 < r6) goto Le
            r2 = 4
            throw r5
            r2 = 5
        Le:
            r2 = 2
            throw r5
            r2 = 3
        */
        throw new UnsupportedOperationException("Method not decompiled: l0.b.getSpans(int, int, java.lang.Class):java.lang.Object[]");
    }

    @Override // java.lang.CharSequence
    public int length() {
        throw null;
    }

    @Override // android.text.Spanned
    public int nextSpanTransition(int i10, int i11, Class cls) {
        throw null;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:202)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:45)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    @Override // android.text.Spannable
    public void removeSpan(java.lang.Object r7) {
        /*
            r6 = this;
            boolean r7 = r7 instanceof android.text.style.MetricAffectingSpan
            r4 = 5
            if (r7 != 0) goto L10
            int r7 = android.os.Build.VERSION.SDK_INT
            r0 = 29
            r2 = 0
            r1 = r2
            if (r7 < r0) goto Lf
            throw r1
            r5 = 4
        Lf:
            throw r1
        L10:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "MetricAffectingSpan can not be removed from PrecomputedText."
            r7.<init>(r0)
            throw r7
            r5 = 4
        */
        throw new UnsupportedOperationException("Method not decompiled: l0.b.removeSpan(java.lang.Object):void");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:202)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:45)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    @Override // android.text.Spannable
    public void setSpan(java.lang.Object r5, int r6, int r7, int r8) {
        /*
            r4 = this;
            r0 = r4
            boolean r5 = r5 instanceof android.text.style.MetricAffectingSpan
            if (r5 != 0) goto L10
            int r5 = android.os.Build.VERSION.SDK_INT
            r6 = 29
            r7 = 0
            if (r5 < r6) goto Lf
            r3 = 3
            throw r7
            r2 = 2
        Lf:
            throw r7
        L10:
            r3 = 4
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            r3 = 1
            java.lang.String r2 = "MetricAffectingSpan can not be set to PrecomputedText."
            r6 = r2
            r5.<init>(r6)
            throw r5
            r2 = 6
        */
        throw new UnsupportedOperationException("Method not decompiled: l0.b.setSpan(java.lang.Object, int, int, int):void");
    }

    @Override // java.lang.CharSequence
    public CharSequence subSequence(int i10, int i11) {
        throw null;
    }

    @Override // java.lang.CharSequence
    public String toString() {
        throw null;
    }
}
