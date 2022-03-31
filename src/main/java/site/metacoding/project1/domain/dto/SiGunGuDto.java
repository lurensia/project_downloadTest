package site.metacoding.project1.domain.dto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class SiGunGuDto {

    private Response response;

    @AllArgsConstructor
    @Data
    class Response {
        private Header header;
        private Body body;

        @AllArgsConstructor
        @Data
        class Header {
            private Integer reqNo;
            private Integer resultCode;
            private String resultMsg;
        }

        @AllArgsConstructor
        @Data
        class Body {
            private Integer nomOfRows;
            private Integer pageNo;
            private Integer totalCount;
            private Items Items;

            @AllArgsConstructor
            @Data
            class Items {
                private List<Item> item;

                @AllArgsConstructor
                @Data
                class Item {
                    private String uprCd;
                    private String orgCd;
                    private String orgdownNm;
                }
            }
        }
    }
}
