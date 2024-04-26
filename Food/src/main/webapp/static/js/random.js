document.addEventListener("DOMContentLoaded", () => {
  const arrow = document.querySelector(".arrow");
  let isSpinning = false;

  function spinRoulette() {
    if (!isSpinning) {
      isSpinning = true;
      arrow.style.transition = "transform 3s ease-in-out";
      arrow.style.transform = `rotate(3600deg) translate(-50%, -50%)`; // 중앙으로 이동
      setTimeout(() => {
        arrow.style.transition = "none";
        isSpinning = false;
      }, 3000);
    }
  }

  document
    .getElementById("randomButton")
    .addEventListener("click", spinRoulette);
});
