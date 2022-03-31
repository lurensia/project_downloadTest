package site.metacoding.project1.domain.dto;

import java.util.List;

import org.apache.catalina.connector.Response;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class SiDoDto {
    private Response response;

    @AllArgsConstructor
    @Data
    class response {
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
                    private Integer orgCd;
                    private String orgdownNm;
                }
            }
        }
    }
}
