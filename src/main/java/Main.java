import com.fasterxml.jackson.core.*;

import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;

public class Main {

    public static void main (String[] args){
        System.out.println("Hello World!");
        JsonParser parser = new JsonParser() {
            @Override
            public ObjectCodec getCodec() {
                return null;
            }

            @Override
            public void setCodec(ObjectCodec objectCodec) {

            }

            @Override
            public Version version() {
                return null;
            }

            @Override
            public void close() throws IOException {

            }

            @Override
            public boolean isClosed() {
                return false;
            }

            @Override
            public JsonStreamContext getParsingContext() {
                return null;
            }

            @Override
            public JsonLocation getTokenLocation() {
                return null;
            }

            @Override
            public JsonLocation getCurrentLocation() {
                return null;
            }

            @Override
            public JsonToken nextToken() throws IOException {
                return null;
            }

            @Override
            public JsonToken nextValue() throws IOException {
                return null;
            }

            @Override
            public JsonParser skipChildren() throws IOException {
                return null;
            }

            @Override
            public JsonToken getCurrentToken() {
                return null;
            }

            @Override
            public int getCurrentTokenId() {
                return 0;
            }

            @Override
            public boolean hasCurrentToken() {
                return false;
            }

            @Override
            public boolean hasTokenId(int i) {
                return false;
            }

            @Override
            public boolean hasToken(JsonToken jsonToken) {
                return false;
            }

            @Override
            public void clearCurrentToken() {

            }

            @Override
            public JsonToken getLastClearedToken() {
                return null;
            }

            @Override
            public void overrideCurrentName(String s) {

            }

            @Override
            public String getCurrentName() throws IOException {
                return null;
            }

            @Override
            public String getText() throws IOException {
                return null;
            }

            @Override
            public char[] getTextCharacters() throws IOException {
                return new char[0];
            }

            @Override
            public int getTextLength() throws IOException {
                return 0;
            }

            @Override
            public int getTextOffset() throws IOException {
                return 0;
            }

            @Override
            public boolean hasTextCharacters() {
                return false;
            }

            @Override
            public Number getNumberValue() throws IOException {
                return null;
            }

            @Override
            public NumberType getNumberType() throws IOException {
                return null;
            }

            @Override
            public int getIntValue() throws IOException {
                return 0;
            }

            @Override
            public long getLongValue() throws IOException {
                return 0;
            }

            @Override
            public BigInteger getBigIntegerValue() throws IOException {
                return null;
            }

            @Override
            public float getFloatValue() throws IOException {
                return 0;
            }

            @Override
            public double getDoubleValue() throws IOException {
                return 0;
            }

            @Override
            public BigDecimal getDecimalValue() throws IOException {
                return null;
            }

            @Override
            public byte[] getBinaryValue(Base64Variant base64Variant) throws IOException {
                return new byte[0];
            }

            @Override
            public String getValueAsString(String s) throws IOException {
                return null;
            }
        };
    }
}
