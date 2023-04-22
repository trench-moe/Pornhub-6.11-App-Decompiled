package t9;

import com.app.pornhub.R;
import cz.msebera.android.httpclient.ProtocolVersion;
import cz.msebera.android.httpclient.util.CharArrayBuffer;
import java.util.BitSet;
import java.util.Iterator;
import w9.g7;
import w9.h7;

/* loaded from: classes2.dex */
public class j0 implements o1, e9.l, ud.j, v5.b {

    /* renamed from: f0  reason: collision with root package name */
    public static j0 f15264f0;

    /* renamed from: c  reason: collision with root package name */
    public static final o1 f15259c = new j0();

    /* renamed from: f  reason: collision with root package name */
    public static final o1 f15263f = new j0();

    /* renamed from: j  reason: collision with root package name */
    public static final /* synthetic */ j0 f15265j = new j0();

    /* renamed from: m  reason: collision with root package name */
    public static final j0 f15266m = new j0();
    public static final j0 n = new j0();

    /* renamed from: t  reason: collision with root package name */
    public static final j0 f15267t = new j0();

    /* renamed from: u  reason: collision with root package name */
    public static final Iterator f15268u = new g7();

    /* renamed from: w  reason: collision with root package name */
    public static final Iterable f15269w = new h7();
    public static final int[] y = {R.attr.carousel_backwardTransition, R.attr.carousel_emptyViewsBehavior, R.attr.carousel_firstView, R.attr.carousel_forwardTransition, R.attr.carousel_infinite, R.attr.carousel_nextState, R.attr.carousel_previousState, R.attr.carousel_touchUpMode, R.attr.carousel_touchUp_dampeningFactor, R.attr.carousel_touchUp_velocityThreshold};

    /* renamed from: z  reason: collision with root package name */
    public static final int[] f15270z = {16842948, 16842960, 16842972, 16842996, 16842997, 16842999, 16843000, 16843001, 16843002, 16843039, 16843040, 16843071, 16843072, 16843551, 16843552, 16843553, 16843554, 16843555, 16843556, 16843557, 16843558, 16843559, 16843560, 16843701, 16843702, 16843770, 16843840, R.attr.animateCircleAngleTo, R.attr.animateRelativeTo, R.attr.barrierAllowsGoneWidgets, R.attr.barrierDirection, R.attr.barrierMargin, R.attr.chainUseRtl, R.attr.constraint_referenced_ids, R.attr.constraint_referenced_tags, R.attr.drawPath, R.attr.flow_firstHorizontalBias, R.attr.flow_firstHorizontalStyle, R.attr.flow_firstVerticalBias, R.attr.flow_firstVerticalStyle, R.attr.flow_horizontalAlign, R.attr.flow_horizontalBias, R.attr.flow_horizontalGap, R.attr.flow_horizontalStyle, R.attr.flow_lastHorizontalBias, R.attr.flow_lastHorizontalStyle, R.attr.flow_lastVerticalBias, R.attr.flow_lastVerticalStyle, R.attr.flow_maxElementsWrap, R.attr.flow_verticalAlign, R.attr.flow_verticalBias, R.attr.flow_verticalGap, R.attr.flow_verticalStyle, R.attr.flow_wrapMode, R.attr.guidelineUseRtl, R.attr.layout_constrainedHeight, R.attr.layout_constrainedWidth, R.attr.layout_constraintBaseline_creator, R.attr.layout_constraintBaseline_toBaselineOf, R.attr.layout_constraintBaseline_toBottomOf, R.attr.layout_constraintBaseline_toTopOf, R.attr.layout_constraintBottom_creator, R.attr.layout_constraintBottom_toBottomOf, R.attr.layout_constraintBottom_toTopOf, R.attr.layout_constraintCircle, R.attr.layout_constraintCircleAngle, R.attr.layout_constraintCircleRadius, R.attr.layout_constraintDimensionRatio, R.attr.layout_constraintEnd_toEndOf, R.attr.layout_constraintEnd_toStartOf, R.attr.layout_constraintGuide_begin, R.attr.layout_constraintGuide_end, R.attr.layout_constraintGuide_percent, R.attr.layout_constraintHeight, R.attr.layout_constraintHeight_default, R.attr.layout_constraintHeight_max, R.attr.layout_constraintHeight_min, R.attr.layout_constraintHeight_percent, R.attr.layout_constraintHorizontal_bias, R.attr.layout_constraintHorizontal_chainStyle, R.attr.layout_constraintHorizontal_weight, R.attr.layout_constraintLeft_creator, R.attr.layout_constraintLeft_toLeftOf, R.attr.layout_constraintLeft_toRightOf, R.attr.layout_constraintRight_creator, R.attr.layout_constraintRight_toLeftOf, R.attr.layout_constraintRight_toRightOf, R.attr.layout_constraintStart_toEndOf, R.attr.layout_constraintStart_toStartOf, R.attr.layout_constraintTag, R.attr.layout_constraintTop_creator, R.attr.layout_constraintTop_toBottomOf, R.attr.layout_constraintTop_toTopOf, R.attr.layout_constraintVertical_bias, R.attr.layout_constraintVertical_chainStyle, R.attr.layout_constraintVertical_weight, R.attr.layout_constraintWidth, R.attr.layout_constraintWidth_default, R.attr.layout_constraintWidth_max, R.attr.layout_constraintWidth_min, R.attr.layout_constraintWidth_percent, R.attr.layout_editor_absoluteX, R.attr.layout_editor_absoluteY, R.attr.layout_goneMarginBaseline, R.attr.layout_goneMarginBottom, R.attr.layout_goneMarginEnd, R.attr.layout_goneMarginLeft, R.attr.layout_goneMarginRight, R.attr.layout_goneMarginStart, R.attr.layout_goneMarginTop, R.attr.layout_marginBaseline, R.attr.layout_wrapBehaviorInParent, R.attr.motionProgress, R.attr.motionStagger, R.attr.pathMotionArc, R.attr.pivotAnchor, R.attr.polarRelativeTo, R.attr.quantizeMotionInterpolator, R.attr.quantizeMotionPhase, R.attr.quantizeMotionSteps, R.attr.transformPivotTarget, R.attr.transitionEasing, R.attr.transitionPathRotate, R.attr.visibilityMode};
    public static final int[] A = {16842948, 16842965, 16842966, 16842967, 16842968, 16842969, 16842972, 16842996, 16842997, 16842998, 16842999, 16843000, 16843001, 16843002, 16843039, 16843040, 16843071, 16843072, 16843699, 16843700, 16843701, 16843702, 16843840, 16844091, 16844092, R.attr.barrierAllowsGoneWidgets, R.attr.barrierDirection, R.attr.barrierMargin, R.attr.chainUseRtl, R.attr.circularflow_angles, R.attr.circularflow_defaultAngle, R.attr.circularflow_defaultRadius, R.attr.circularflow_radiusInDP, R.attr.circularflow_viewCenter, R.attr.constraintSet, R.attr.constraint_referenced_ids, R.attr.constraint_referenced_tags, R.attr.flow_firstHorizontalBias, R.attr.flow_firstHorizontalStyle, R.attr.flow_firstVerticalBias, R.attr.flow_firstVerticalStyle, R.attr.flow_horizontalAlign, R.attr.flow_horizontalBias, R.attr.flow_horizontalGap, R.attr.flow_horizontalStyle, R.attr.flow_lastHorizontalBias, R.attr.flow_lastHorizontalStyle, R.attr.flow_lastVerticalBias, R.attr.flow_lastVerticalStyle, R.attr.flow_maxElementsWrap, R.attr.flow_verticalAlign, R.attr.flow_verticalBias, R.attr.flow_verticalGap, R.attr.flow_verticalStyle, R.attr.flow_wrapMode, R.attr.guidelineUseRtl, R.attr.layoutDescription, R.attr.layout_constrainedHeight, R.attr.layout_constrainedWidth, R.attr.layout_constraintBaseline_creator, R.attr.layout_constraintBaseline_toBaselineOf, R.attr.layout_constraintBaseline_toBottomOf, R.attr.layout_constraintBaseline_toTopOf, R.attr.layout_constraintBottom_creator, R.attr.layout_constraintBottom_toBottomOf, R.attr.layout_constraintBottom_toTopOf, R.attr.layout_constraintCircle, R.attr.layout_constraintCircleAngle, R.attr.layout_constraintCircleRadius, R.attr.layout_constraintDimensionRatio, R.attr.layout_constraintEnd_toEndOf, R.attr.layout_constraintEnd_toStartOf, R.attr.layout_constraintGuide_begin, R.attr.layout_constraintGuide_end, R.attr.layout_constraintGuide_percent, R.attr.layout_constraintHeight, R.attr.layout_constraintHeight_default, R.attr.layout_constraintHeight_max, R.attr.layout_constraintHeight_min, R.attr.layout_constraintHeight_percent, R.attr.layout_constraintHorizontal_bias, R.attr.layout_constraintHorizontal_chainStyle, R.attr.layout_constraintHorizontal_weight, R.attr.layout_constraintLeft_creator, R.attr.layout_constraintLeft_toLeftOf, R.attr.layout_constraintLeft_toRightOf, R.attr.layout_constraintRight_creator, R.attr.layout_constraintRight_toLeftOf, R.attr.layout_constraintRight_toRightOf, R.attr.layout_constraintStart_toEndOf, R.attr.layout_constraintStart_toStartOf, R.attr.layout_constraintTag, R.attr.layout_constraintTop_creator, R.attr.layout_constraintTop_toBottomOf, R.attr.layout_constraintTop_toTopOf, R.attr.layout_constraintVertical_bias, R.attr.layout_constraintVertical_chainStyle, R.attr.layout_constraintVertical_weight, R.attr.layout_constraintWidth, R.attr.layout_constraintWidth_default, R.attr.layout_constraintWidth_max, R.attr.layout_constraintWidth_min, R.attr.layout_constraintWidth_percent, R.attr.layout_editor_absoluteX, R.attr.layout_editor_absoluteY, R.attr.layout_goneMarginBaseline, R.attr.layout_goneMarginBottom, R.attr.layout_goneMarginEnd, R.attr.layout_goneMarginLeft, R.attr.layout_goneMarginRight, R.attr.layout_goneMarginStart, R.attr.layout_goneMarginTop, R.attr.layout_marginBaseline, R.attr.layout_optimizationLevel, R.attr.layout_wrapBehaviorInParent};
    public static final int[] B = {R.attr.reactiveGuide_animateChange, R.attr.reactiveGuide_applyToAllConstraintSets, R.attr.reactiveGuide_applyToConstraintSet, R.attr.reactiveGuide_valueId};
    public static final int[] C = {R.attr.content, R.attr.placeholder_emptyVisibility};
    public static final int[] D = {16842948, 16842960, 16842972, 16842996, 16842997, 16842999, 16843000, 16843001, 16843002, 16843039, 16843040, 16843071, 16843072, 16843551, 16843552, 16843553, 16843554, 16843555, 16843556, 16843557, 16843558, 16843559, 16843560, 16843701, 16843702, 16843770, 16843840, R.attr.animateCircleAngleTo, R.attr.animateRelativeTo, R.attr.barrierAllowsGoneWidgets, R.attr.barrierDirection, R.attr.barrierMargin, R.attr.chainUseRtl, R.attr.constraint_referenced_ids, R.attr.drawPath, R.attr.flow_firstHorizontalBias, R.attr.flow_firstHorizontalStyle, R.attr.flow_firstVerticalBias, R.attr.flow_firstVerticalStyle, R.attr.flow_horizontalAlign, R.attr.flow_horizontalBias, R.attr.flow_horizontalGap, R.attr.flow_horizontalStyle, R.attr.flow_lastHorizontalBias, R.attr.flow_lastHorizontalStyle, R.attr.flow_lastVerticalBias, R.attr.flow_lastVerticalStyle, R.attr.flow_maxElementsWrap, R.attr.flow_verticalAlign, R.attr.flow_verticalBias, R.attr.flow_verticalGap, R.attr.flow_verticalStyle, R.attr.flow_wrapMode, R.attr.guidelineUseRtl, R.attr.layout_constrainedHeight, R.attr.layout_constrainedWidth, R.attr.layout_constraintBaseline_creator, R.attr.layout_constraintBottom_creator, R.attr.layout_constraintCircleAngle, R.attr.layout_constraintCircleRadius, R.attr.layout_constraintDimensionRatio, R.attr.layout_constraintGuide_begin, R.attr.layout_constraintGuide_end, R.attr.layout_constraintGuide_percent, R.attr.layout_constraintHeight, R.attr.layout_constraintHeight_default, R.attr.layout_constraintHeight_max, R.attr.layout_constraintHeight_min, R.attr.layout_constraintHeight_percent, R.attr.layout_constraintHorizontal_bias, R.attr.layout_constraintHorizontal_chainStyle, R.attr.layout_constraintHorizontal_weight, R.attr.layout_constraintLeft_creator, R.attr.layout_constraintRight_creator, R.attr.layout_constraintTag, R.attr.layout_constraintTop_creator, R.attr.layout_constraintVertical_bias, R.attr.layout_constraintVertical_chainStyle, R.attr.layout_constraintVertical_weight, R.attr.layout_constraintWidth, R.attr.layout_constraintWidth_default, R.attr.layout_constraintWidth_max, R.attr.layout_constraintWidth_min, R.attr.layout_constraintWidth_percent, R.attr.layout_editor_absoluteX, R.attr.layout_editor_absoluteY, R.attr.layout_goneMarginBaseline, R.attr.layout_goneMarginBottom, R.attr.layout_goneMarginEnd, R.attr.layout_goneMarginLeft, R.attr.layout_goneMarginRight, R.attr.layout_goneMarginStart, R.attr.layout_goneMarginTop, R.attr.layout_marginBaseline, R.attr.layout_wrapBehaviorInParent, R.attr.motionProgress, R.attr.motionStagger, R.attr.motionTarget, R.attr.pathMotionArc, R.attr.pivotAnchor, R.attr.polarRelativeTo, R.attr.quantizeMotionInterpolator, R.attr.quantizeMotionPhase, R.attr.quantizeMotionSteps, R.attr.transformPivotTarget, R.attr.transitionEasing, R.attr.transitionPathRotate, R.attr.visibilityMode};
    public static final int[] E = {16842948, 16842960, 16842972, 16842996, 16842997, 16842999, 16843000, 16843001, 16843002, 16843039, 16843040, 16843071, 16843072, 16843189, 16843190, 16843551, 16843552, 16843553, 16843554, 16843555, 16843556, 16843557, 16843558, 16843559, 16843560, 16843701, 16843702, 16843770, 16843840, R.attr.animateCircleAngleTo, R.attr.animateRelativeTo, R.attr.barrierAllowsGoneWidgets, R.attr.barrierDirection, R.attr.barrierMargin, R.attr.chainUseRtl, R.attr.constraintRotate, R.attr.constraint_referenced_ids, R.attr.constraint_referenced_tags, R.attr.deriveConstraintsFrom, R.attr.drawPath, R.attr.flow_firstHorizontalBias, R.attr.flow_firstHorizontalStyle, R.attr.flow_firstVerticalBias, R.attr.flow_firstVerticalStyle, R.attr.flow_horizontalAlign, R.attr.flow_horizontalBias, R.attr.flow_horizontalGap, R.attr.flow_horizontalStyle, R.attr.flow_lastHorizontalBias, R.attr.flow_lastHorizontalStyle, R.attr.flow_lastVerticalBias, R.attr.flow_lastVerticalStyle, R.attr.flow_maxElementsWrap, R.attr.flow_verticalAlign, R.attr.flow_verticalBias, R.attr.flow_verticalGap, R.attr.flow_verticalStyle, R.attr.flow_wrapMode, R.attr.guidelineUseRtl, R.attr.layout_constrainedHeight, R.attr.layout_constrainedWidth, R.attr.layout_constraintBaseline_creator, R.attr.layout_constraintBaseline_toBaselineOf, R.attr.layout_constraintBaseline_toBottomOf, R.attr.layout_constraintBaseline_toTopOf, R.attr.layout_constraintBottom_creator, R.attr.layout_constraintBottom_toBottomOf, R.attr.layout_constraintBottom_toTopOf, R.attr.layout_constraintCircle, R.attr.layout_constraintCircleAngle, R.attr.layout_constraintCircleRadius, R.attr.layout_constraintDimensionRatio, R.attr.layout_constraintEnd_toEndOf, R.attr.layout_constraintEnd_toStartOf, R.attr.layout_constraintGuide_begin, R.attr.layout_constraintGuide_end, R.attr.layout_constraintGuide_percent, R.attr.layout_constraintHeight_default, R.attr.layout_constraintHeight_max, R.attr.layout_constraintHeight_min, R.attr.layout_constraintHeight_percent, R.attr.layout_constraintHorizontal_bias, R.attr.layout_constraintHorizontal_chainStyle, R.attr.layout_constraintHorizontal_weight, R.attr.layout_constraintLeft_creator, R.attr.layout_constraintLeft_toLeftOf, R.attr.layout_constraintLeft_toRightOf, R.attr.layout_constraintRight_creator, R.attr.layout_constraintRight_toLeftOf, R.attr.layout_constraintRight_toRightOf, R.attr.layout_constraintStart_toEndOf, R.attr.layout_constraintStart_toStartOf, R.attr.layout_constraintTag, R.attr.layout_constraintTop_creator, R.attr.layout_constraintTop_toBottomOf, R.attr.layout_constraintTop_toTopOf, R.attr.layout_constraintVertical_bias, R.attr.layout_constraintVertical_chainStyle, R.attr.layout_constraintVertical_weight, R.attr.layout_constraintWidth_default, R.attr.layout_constraintWidth_max, R.attr.layout_constraintWidth_min, R.attr.layout_constraintWidth_percent, R.attr.layout_editor_absoluteX, R.attr.layout_editor_absoluteY, R.attr.layout_goneMarginBaseline, R.attr.layout_goneMarginBottom, R.attr.layout_goneMarginEnd, R.attr.layout_goneMarginLeft, R.attr.layout_goneMarginRight, R.attr.layout_goneMarginStart, R.attr.layout_goneMarginTop, R.attr.layout_marginBaseline, R.attr.layout_wrapBehaviorInParent, R.attr.motionProgress, R.attr.motionStagger, R.attr.pathMotionArc, R.attr.pivotAnchor, R.attr.polarRelativeTo, R.attr.quantizeMotionSteps, R.attr.transitionEasing, R.attr.transitionPathRotate};
    public static final int[] F = {R.attr.attributeName, R.attr.customBoolean, R.attr.customColorDrawableValue, R.attr.customColorValue, R.attr.customDimension, R.attr.customFloatValue, R.attr.customIntegerValue, R.attr.customPixelDimension, R.attr.customReference, R.attr.customStringValue, R.attr.methodName};
    public static final int[] G = {R.attr.altSrc, R.attr.blendSrc, R.attr.brightness, R.attr.contrast, R.attr.crossfade, R.attr.imagePanX, R.attr.imagePanY, R.attr.imageRotate, R.attr.imageZoom, R.attr.overlay, R.attr.round, R.attr.roundPercent, R.attr.saturation, R.attr.warmth};
    public static final int[] H = {16843551, 16843552, 16843553, 16843554, 16843555, 16843556, 16843557, 16843558, 16843559, 16843560, 16843770, 16843840, R.attr.curveFit, R.attr.framePosition, R.attr.motionProgress, R.attr.motionTarget, R.attr.transformPivotTarget, R.attr.transitionEasing, R.attr.transitionPathRotate};
    public static final int[] I = {16843551, 16843554, 16843555, 16843556, 16843557, 16843558, 16843559, 16843560, 16843770, 16843840, R.attr.curveFit, R.attr.framePosition, R.attr.motionProgress, R.attr.motionTarget, R.attr.transitionEasing, R.attr.transitionPathRotate, R.attr.waveOffset, R.attr.wavePeriod, R.attr.wavePhase, R.attr.waveShape, R.attr.waveVariesBy};
    public static final int[] J = {R.attr.curveFit, R.attr.drawPath, R.attr.framePosition, R.attr.keyPositionType, R.attr.motionTarget, R.attr.pathMotionArc, R.attr.percentHeight, R.attr.percentWidth, R.attr.percentX, R.attr.percentY, R.attr.sizePercent, R.attr.transitionEasing};
    public static final int[] K = {16843551, 16843554, 16843555, 16843556, 16843557, 16843558, 16843559, 16843560, 16843770, 16843840, R.attr.curveFit, R.attr.framePosition, R.attr.motionProgress, R.attr.motionTarget, R.attr.transitionEasing, R.attr.transitionPathRotate, R.attr.waveDecay, R.attr.waveOffset, R.attr.wavePeriod, R.attr.wavePhase, R.attr.waveShape};
    public static final int[] L = {R.attr.framePosition, R.attr.motionTarget, R.attr.motion_postLayoutCollision, R.attr.motion_triggerOnCollision, R.attr.onCross, R.attr.onNegativeCross, R.attr.onPositiveCross, R.attr.triggerId, R.attr.triggerReceiver, R.attr.triggerSlack, R.attr.viewTransitionOnCross, R.attr.viewTransitionOnNegativeCross, R.attr.viewTransitionOnPositiveCross};
    public static final int[] M = {16842948, 16842996, 16842997, 16842999, 16843000, 16843001, 16843002, 16843701, 16843702, R.attr.barrierAllowsGoneWidgets, R.attr.barrierDirection, R.attr.barrierMargin, R.attr.chainUseRtl, R.attr.constraint_referenced_ids, R.attr.constraint_referenced_tags, R.attr.guidelineUseRtl, R.attr.layout_constrainedHeight, R.attr.layout_constrainedWidth, R.attr.layout_constraintBaseline_creator, R.attr.layout_constraintBaseline_toBaselineOf, R.attr.layout_constraintBaseline_toBottomOf, R.attr.layout_constraintBaseline_toTopOf, R.attr.layout_constraintBottom_creator, R.attr.layout_constraintBottom_toBottomOf, R.attr.layout_constraintBottom_toTopOf, R.attr.layout_constraintCircle, R.attr.layout_constraintCircleAngle, R.attr.layout_constraintCircleRadius, R.attr.layout_constraintDimensionRatio, R.attr.layout_constraintEnd_toEndOf, R.attr.layout_constraintEnd_toStartOf, R.attr.layout_constraintGuide_begin, R.attr.layout_constraintGuide_end, R.attr.layout_constraintGuide_percent, R.attr.layout_constraintHeight, R.attr.layout_constraintHeight_default, R.attr.layout_constraintHeight_max, R.attr.layout_constraintHeight_min, R.attr.layout_constraintHeight_percent, R.attr.layout_constraintHorizontal_bias, R.attr.layout_constraintHorizontal_chainStyle, R.attr.layout_constraintHorizontal_weight, R.attr.layout_constraintLeft_creator, R.attr.layout_constraintLeft_toLeftOf, R.attr.layout_constraintLeft_toRightOf, R.attr.layout_constraintRight_creator, R.attr.layout_constraintRight_toLeftOf, R.attr.layout_constraintRight_toRightOf, R.attr.layout_constraintStart_toEndOf, R.attr.layout_constraintStart_toStartOf, R.attr.layout_constraintTop_creator, R.attr.layout_constraintTop_toBottomOf, R.attr.layout_constraintTop_toTopOf, R.attr.layout_constraintVertical_bias, R.attr.layout_constraintVertical_chainStyle, R.attr.layout_constraintVertical_weight, R.attr.layout_constraintWidth, R.attr.layout_constraintWidth_default, R.attr.layout_constraintWidth_max, R.attr.layout_constraintWidth_min, R.attr.layout_constraintWidth_percent, R.attr.layout_editor_absoluteX, R.attr.layout_editor_absoluteY, R.attr.layout_goneMarginBaseline, R.attr.layout_goneMarginBottom, R.attr.layout_goneMarginEnd, R.attr.layout_goneMarginLeft, R.attr.layout_goneMarginRight, R.attr.layout_goneMarginStart, R.attr.layout_goneMarginTop, R.attr.layout_marginBaseline, R.attr.layout_wrapBehaviorInParent, R.attr.maxHeight, R.attr.maxWidth, R.attr.minHeight, R.attr.minWidth};
    public static final int[] N = {R.attr.mock_diagonalsColor, R.attr.mock_label, R.attr.mock_labelBackgroundColor, R.attr.mock_labelColor, R.attr.mock_showDiagonals, R.attr.mock_showLabel};
    public static final int[] O = {R.attr.animateCircleAngleTo, R.attr.animateRelativeTo, R.attr.drawPath, R.attr.motionPathRotate, R.attr.motionStagger, R.attr.pathMotionArc, R.attr.quantizeMotionInterpolator, R.attr.quantizeMotionPhase, R.attr.quantizeMotionSteps, R.attr.transitionEasing};
    public static final int[] P = {R.attr.motionEffect_alpha, R.attr.motionEffect_end, R.attr.motionEffect_move, R.attr.motionEffect_start, R.attr.motionEffect_strict, R.attr.motionEffect_translationX, R.attr.motionEffect_translationY, R.attr.motionEffect_viewTransition};
    public static final int[] Q = {R.attr.onHide, R.attr.onShow};
    public static final int[] R = {16842901, 16842902, 16842903, 16842904, 16842927, 16843087, 16843108, 16843692, 16844085, R.attr.borderRound, R.attr.borderRoundPercent, R.attr.scaleFromTextSize, R.attr.textBackground, R.attr.textBackgroundPanX, R.attr.textBackgroundPanY, R.attr.textBackgroundRotate, R.attr.textBackgroundZoom, R.attr.textOutlineColor, R.attr.textOutlineThickness, R.attr.textPanX, R.attr.textPanY, R.attr.textureBlurFactor, R.attr.textureEffect, R.attr.textureHeight, R.attr.textureWidth};
    public static final int[] S = {R.attr.applyMotionScene, R.attr.currentState, R.attr.layoutDescription, R.attr.motionDebug, R.attr.motionProgress, R.attr.showPaths};
    public static final int[] T = {R.attr.defaultDuration, R.attr.layoutDuringTransition};
    public static final int[] U = {R.attr.telltales_tailColor, R.attr.telltales_tailScale, R.attr.telltales_velocityMode};
    public static final int[] V = {R.attr.clickAction, R.attr.targetId};
    public static final int[] W = {R.attr.autoCompleteMode, R.attr.dragDirection, R.attr.dragScale, R.attr.dragThreshold, R.attr.limitBoundsTo, R.attr.maxAcceleration, R.attr.maxVelocity, R.attr.moveWhenScrollAtTop, R.attr.nestedScrollFlags, R.attr.onTouchUp, R.attr.rotationCenterId, R.attr.springBoundary, R.attr.springDamping, R.attr.springMass, R.attr.springStiffness, R.attr.springStopThreshold, R.attr.touchAnchorId, R.attr.touchAnchorSide, R.attr.touchRegionId};
    public static final int[] X = {16842972, 16843551, R.attr.layout_constraintTag, R.attr.motionProgress, R.attr.visibilityMode};
    public static final int[] Y = {16842960, R.attr.constraints};
    public static final int[] Z = {R.attr.defaultState};

    /* renamed from: a0  reason: collision with root package name */
    public static final int[] f15257a0 = {16843552, 16843553, 16843554, 16843555, 16843556, 16843557, 16843558, 16843559, 16843560, 16843770, 16843840, R.attr.transformPivotTarget};

    /* renamed from: b0  reason: collision with root package name */
    public static final int[] f15258b0 = {16842960, R.attr.autoTransition, R.attr.constraintSetEnd, R.attr.constraintSetStart, R.attr.duration, R.attr.layoutDuringTransition, R.attr.motionInterpolator, R.attr.pathMotionArc, R.attr.staggered, R.attr.transitionDisable, R.attr.transitionFlags};

    /* renamed from: c0  reason: collision with root package name */
    public static final int[] f15260c0 = {R.attr.constraints, R.attr.region_heightLessThan, R.attr.region_heightMoreThan, R.attr.region_widthLessThan, R.attr.region_widthMoreThan};

    /* renamed from: d0  reason: collision with root package name */
    public static final int[] f15261d0 = {16842960, R.attr.SharedValue, R.attr.SharedValueId, R.attr.clearsTag, R.attr.duration, R.attr.ifTagNotSet, R.attr.ifTagSet, R.attr.motionInterpolator, R.attr.motionTarget, R.attr.onStateTransition, R.attr.pathMotionArc, R.attr.setsTag, R.attr.transitionDisable, R.attr.upDuration, R.attr.viewTransitionMode};

    /* renamed from: e0  reason: collision with root package name */
    public static final int[] f15262e0 = {R.attr.constraintSet};

    public static boolean g(char c10) {
        if (c10 != ' ' && c10 != '\t' && c10 != '\r') {
            if (c10 != '\n') {
                return false;
            }
        }
        return true;
    }

    public static int j(int i10) {
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        return i10 != 4 ? 0 : 5;
                    }
                    return 4;
                }
                return 3;
            }
            return 2;
        }
        return 1;
    }

    @Override // v5.b
    public j5.i a(j5.i iVar, h5.d dVar) {
        return iVar;
    }

    @Override // e9.l
    public void accept(Object obj, Object obj2) {
        a9.b bVar = u8.l0.G;
        a9.f fVar = (a9.f) ((a9.c0) obj).getService();
        fVar.d1(19, fVar.a1());
        ((ea.h) obj2).f9273a.p(Boolean.TRUE);
    }

    public CharArrayBuffer b(CharArrayBuffer charArrayBuffer, ProtocolVersion protocolVersion) {
        l9.e.l(protocolVersion, "Protocol version");
        charArrayBuffer.f(c(protocolVersion));
        charArrayBuffer.c(protocolVersion.protocol);
        charArrayBuffer.a('/');
        charArrayBuffer.c(Integer.toString(protocolVersion.major));
        charArrayBuffer.a('.');
        charArrayBuffer.c(Integer.toString(protocolVersion.minor));
        return charArrayBuffer;
    }

    public int c(ProtocolVersion protocolVersion) {
        return protocolVersion.protocol.length() + 4;
    }

    public CharArrayBuffer d(CharArrayBuffer charArrayBuffer, md.d dVar) {
        l9.e.l(dVar, "Header");
        if (dVar instanceof md.c) {
            return ((md.c) dVar).b();
        }
        CharArrayBuffer f10 = f(charArrayBuffer);
        String name = dVar.getName();
        String value = dVar.getValue();
        int length = name.length() + 2;
        if (value != null) {
            length += value.length();
        }
        f10.f(length);
        f10.c(name);
        f10.c(": ");
        if (value != null) {
            f10.f(value.length() + f10.length());
            for (int i10 = 0; i10 < value.length(); i10++) {
                char charAt = value.charAt(i10);
                if (charAt == '\r' || charAt == '\n' || charAt == '\f' || charAt == 11) {
                    charAt = ' ';
                }
                f10.a(charAt);
            }
        }
        return f10;
    }

    public CharArrayBuffer e(CharArrayBuffer charArrayBuffer, md.r rVar) {
        l9.e.l(rVar, "Status line");
        CharArrayBuffer f10 = f(charArrayBuffer);
        int c10 = c(rVar.a()) + 1 + 3 + 1;
        String c11 = rVar.c();
        if (c11 != null) {
            c10 += c11.length();
        }
        f10.f(c10);
        b(f10, rVar.a());
        f10.a(' ');
        f10.c(Integer.toString(rVar.b()));
        f10.a(' ');
        if (c11 != null) {
            f10.c(c11);
        }
        return f10;
    }

    public CharArrayBuffer f(CharArrayBuffer charArrayBuffer) {
        if (charArrayBuffer != null) {
            charArrayBuffer.clear();
            return charArrayBuffer;
        }
        return new CharArrayBuffer(64);
    }

    public String h(CharArrayBuffer charArrayBuffer, ud.l lVar, BitSet bitSet) {
        StringBuilder sb2 = new StringBuilder();
        loop0: while (true) {
            boolean z10 = false;
            while (!lVar.a()) {
                char charAt = charArrayBuffer.charAt(lVar.f15876b);
                if (bitSet != null && bitSet.get(charAt)) {
                    break loop0;
                } else if (g(charAt)) {
                    i(charArrayBuffer, lVar);
                    z10 = true;
                } else {
                    if (z10 && sb2.length() > 0) {
                        sb2.append(' ');
                    }
                    int i10 = lVar.f15876b;
                    int i11 = lVar.f15875a;
                    int i12 = i10;
                    while (i10 < i11) {
                        char charAt2 = charArrayBuffer.charAt(i10);
                        if ((bitSet == null || !bitSet.get(charAt2)) && !g(charAt2)) {
                            i12++;
                            sb2.append(charAt2);
                            i10++;
                        }
                        lVar.b(i12);
                    }
                    lVar.b(i12);
                }
            }
            break loop0;
        }
        return sb2.toString();
    }

    public void i(CharArrayBuffer charArrayBuffer, ud.l lVar) {
        int i10 = lVar.f15876b;
        int i11 = lVar.f15875a;
        int i12 = i10;
        while (i10 < i11 && g(charArrayBuffer.charAt(i10))) {
            i12++;
            i10++;
        }
        lVar.b(i12);
    }
}
