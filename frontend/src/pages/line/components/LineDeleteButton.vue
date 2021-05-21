<template>
  <v-btn @click="onDeleteLine" icon>
    <v-icon color="grey lighten-1">mdi-delete</v-icon>
  </v-btn>
</template>

<script>
import {mapMutations} from "vuex";
import {SET_LINES, SHOW_SNACKBAR} from "../../../store/shared/mutationTypes";
import {SNACKBAR_MESSAGES} from "../../../utils/constants";

export default {
  name: "LineDeleteButton",
  props: {
    line: {
      type: Object,
      required: true,
    },
  },
  methods: {
    ...mapMutations([SHOW_SNACKBAR, SET_LINES]),
    async onDeleteLine() {
      try {
        // TODO 2. Line을 삭제하는 API를 추가해주세요. (미완.. Line접근 어떻게?)
        const lineId = this.line.id;
        await fetch(`http://localhost:8080/lines/${lineId}`, {
          method: "DELETE"
        });
        // TODO 3. 전체 Line 데이터를 불러오는 API를 추가해주세요.
        const linesResponse = await fetch("http://localhost:8080/lines")
        const lines = await linesResponse.json();
        this.setLines([...lines])
        this.showSnackbar(SNACKBAR_MESSAGES.LINE.DELETE.SUCCESS);
      } catch (e) {
        this.showSnackbar(SNACKBAR_MESSAGES.LINE.DELETE.FAIL);
      }
    },
  },
};
</script>
