#extension GL_OES_EGL_image_external : require
precision highp float;

uniform int eye;
uniform int stereoType;
uniform samplerExternalOES sampler;

varying vec2 tex;

void main(void) {
    float X = tex.x;
    float Y = tex.y;

    if (stereoType == 1) {
        X = (X + float(eye - 1)) * 0.5;
    } else if (stereoType == 2) {
        Y = (Y + float(eye - 1)) * 0.5;
    } else if (stereoType == 3) {
        X = (X + float(2 - eye)) * 0.5;
    } else if (stereoType == 4) {
        Y = (Y + float(2 - eye)) * 0.5;
    }

    gl_FragColor = texture2D(sampler, vec2(X, 1.0 - Y));
}