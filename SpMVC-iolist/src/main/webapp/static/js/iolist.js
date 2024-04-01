document.addEventListener("DOMContentLoaded", () => {
  const iolist_body = document.querySelector("tbody.iolist_body");
  const btn_update = document.querySelector("input.btn_update");
  const btn_delete = document.querySelector("input.btn_delete");

  const iolist_body_click_handler = (e) => {
    const target = e.target;
    if (target.tagName === "TD") {
      const TR = target.closest("TR");
      const seq = TR.dataset.seq;

      document.location.href = `${rootPath}/iolist/detail?seq=${seq}`;
    }
  };
  iolist_body?.addEventListener("click", iolist_body_click_handler);

  btn_update?.addEventListener("click", (e) => {
    const seq = e.target.dataset.seq;
    document.location.href = `${rootPath}/iolist/update?seq=${seq}`;
  });

  btn_delete?.addEventListener("click", () => {
    const seq = e.target.dataset.seq;
    if (confirm("삭제할까요?")) {
      document.location.replace(`${rootPath}/iolist/delete/${seq}`);
    }
  });
});
